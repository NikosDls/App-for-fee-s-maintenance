package testtime;

import java.util.Scanner;

public class TestTime {

    public static void main(String args[]) {
        Time t1 = new Time(); // 00:00:00 
        Time t2 = new Time(7, 0, 0); // 07:00:00 
        Time t3 = new Time(19, 25, 0); // 19:25:00 
        Time t4 = new Time(12, 15, 50); // 12:15:50 
        Time t5 = new Time(29, 85, 81); // 00:00:00 

        String output = "Constructed with: "
                + "\nt1: all arguments defaulted"
                + "\n " + t1.toUniversalString()
                + "\n " + t1.toStandardString();

        output += "\nt2: hour specified; minute and second defaulted"
                + "\n " + t2.toUniversalString()
                + "\n " + t2.toStandardString();

        output += "\nt3: hour and minute specified; second defaulted"
                + "\n " + t3.toUniversalString()
                + "\n " + t3.toStandardString();

        output += "\nt4: hour, minute and second specified"
                + "\n " + t4.toUniversalString()
                + "\n " + t4.toStandardString();

        output += "\nt5: all invalid values specified"
                + "\n " + t5.toUniversalString()
                + "\n " + t5.toStandardString();

        System.out.println(output);

        System.exit(0);

    } // end main 
} // end class TestTime 