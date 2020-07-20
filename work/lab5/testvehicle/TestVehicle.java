package testvehicle;

import javax.swing.JOptionPane;
import Vehicle.*;

public class TestVehicle {

    public static void main(String[] args) {
        Car car1 = new Car("AUDI", "A4", 20000, 240, 4, 4);
        MotorCycle motorcycle1 = new MotorCycle("KAWASAKI", "250R", 5500, 180, 2, "GOOD");

        JOptionPane.showMessageDialog(null, car1 + "\n\n" + motorcycle1); // display output 
        System.exit(0);
    }

}
