package testsignal;

import java.io.*;

public class Signal {

    private double[] sample;

    // Generates a random signal 
    public Signal(int length) {
        sample = new double[length];
        for (int i = 0; i < sample.length; i++) {
            sample[i] = Math.random();
        }
    }

    // Generates a signal from an array 
    public Signal(double[] array) {
        sample = new double[array.length];
        for (int i = 0; i < sample.length; i++) {
            sample[i] = array[i];
        }

        // if you do sample = array; then you will have a dependent (shallow) copy of the array in sample 
    }

    // Loads and creates a new signal from disk 
    public Signal(String filename) {
        try {
            FileInputStream f = new FileInputStream(filename);
            BufferedInputStream b = new BufferedInputStream(f);
            DataInputStream d = new DataInputStream(b);

            int l = d.readInt();

            // Read the length of the file 
            sample = new double[l];

            // Read each double until length 
            for (int i = 0; i < sample.length; i++) {
                sample[i] = d.readDouble();
            }
            d.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Saves the current signal to disk 
    public void save(String filename) {
        try {
            FileOutputStream f = new FileOutputStream(filename);
            BufferedOutputStream b = new BufferedOutputStream(f);
            DataOutputStream d = new DataOutputStream(b);

            // Write the length of the signal 
            d.writeInt(sample.length);
            
            // Write the data of the signal 
            for (int i = 0; i < sample.length; i++) {
                d.writeDouble(sample[i]);
            }
            d.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < sample.length; i++) {
            s += sample[i] + "\n";
        }
        return s;
    }

    // Returns the length of the current signal 
    public int length() {
        return sample.length;
    }

    // Returns the average of the signal 
    public double average() {
        double ave = 0.0;
        for (int i = 0; i < sample.length; i++) {
            ave += sample[i];
        }
        ave /= sample.length;
        return ave;
    }

    // Returns the maximum of the signal 
    public double maximum() {
        double max = sample[0];
        for (int i = 1; i < sample.length; i++) {
            if (sample[i] > max) {
                max = sample[i];
            }
        }
        return max;
    }

    // Returns the minimum of the signal 
    public double minimum() {
        double min = sample[0];
        for (int i = 1; i < sample.length; i++) {
            if (sample[i] < min) {
                min = sample[i];
            }
        }
        return min;
    }

    // SaveAsText 
    public void saveAsText(String filename) {
        try {
            FileWriter f = new FileWriter(filename);
            BufferedWriter b = new BufferedWriter(f);
            for (int i = 0; i < sample.length; i++) {
                /* Alternative 
                 Double sampleObject = new Double(sample[i]); 
                 b.write(sampleObject.toString()+"\n"); 
                 */

                // This works as well 
                b.write(sample[i] + "\n");
            }

            b.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Returns the signal as an array 
    public double[] toArray() {
        double[] array = new double[sample.length];
        for (int i = 0; i < sample.length; i++) {
            array[i] = sample[i];
        }
        return array;
    }

    // Add a signal to current signal 
    public void add(Signal input) {
        if (length() == input.length()) {
            for (int i = 0; i < length(); i++) {
                sample[i] += input.sample[i];
            }
        }
    }

    public boolean equals(Signal input) {
        boolean b = false;
        if (length() == input.length()) {
            for (int i = 0; i < length(); i++) {
                if (sample[i] != input.sample[i]) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
        }
        return b;
    }

    // Concatenate signal 
    // (it is static because it is independent from instance variable sample) 
    public static Signal concatenate(Signal first, Signal second) {
        double[] array = new double[first.length() + second.length()];

        for (int i = 0; i < first.length(); i++) {
            array[i] = first.sample[i];
        }
        for (int i = 0; i < second.length(); i++) {
            array[first.length() + i] = second.sample[i];
        }
        Signal third = new Signal(array);
        return third;
    }
}