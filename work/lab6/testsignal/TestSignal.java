package testsignal;

public class TestSignal {

    public static void main(String[] args) {
        Signal s1 = new Signal(10);
        System.out.println(s1);
        s1.save("testSignal.dat");

        Signal s2 = new Signal("testSignal.dat");
        System.out.println(s2);
        System.out.println("The average of signal s1 is " + s1.average());
        System.out.println("The minimum of signal s1 is " + s1.minimum());
        System.out.println("The maximum of signal s1 is " + s1.maximum());

        double[] myArray = {5.0, 2.0, -7.0};
        Signal s3 = new Signal(myArray);
        System.out.println(s3);

        s3.saveAsText("textSignal.txt");

        double[] arrayFromSignal = s3.toArray();
        for (int i = 0; i < arrayFromSignal.length; i++) {
            System.out.println(arrayFromSignal[i]);
        }

        double[] anotherArray = {1.0, 1.0, 1.0};
        Signal s4 = new Signal(anotherArray);

        s3.add(s4);
        System.out.println(s3);

        double[] thirdArray = {6.0, 3.0, -6.0};
        Signal s5 = new Signal(thirdArray);
        System.out.println(s3.equals(s5));

        Signal s6 = Signal.concatenate(s1, s4);
        System.out.println(s6);

    }
}