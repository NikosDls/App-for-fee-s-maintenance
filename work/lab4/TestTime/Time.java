package testtime;

import java.text.DecimalFormat;

public class Time {

    private int hour; // 0 - 23 
    private int minute; // 0 - 59 
    private int second; // 0 - 59 

    // set a new time value using universal time; perform 
    // validity checks on data; set invalid values to zero 
    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0);
        minute = ((m >= 0 && m < 60) ? m : 0);
        second = ((s >= 0 && s < 60) ? s : 0);
    }
// Time constructor: hour, minute and second supplied 

    public Time(int h, int m, int s) {
        setTime(h, m, s); // invoke method setTime to validate time 
    }
    // Time constructor initializes each instance variable to zero; 
    // ensures that Time object starts in a consistent state 

    public Time() {
        this(0, 0, 0); // invoke Time constructor with three arguments 
    }

    // convert to String in universal-time format 
    public String toUniversalString() {
        DecimalFormat twoDigits = new DecimalFormat("00");

        return twoDigits.format(hour) + ":"
                + twoDigits.format(minute) + ":" + twoDigits.format(second);
    }

    // convert to String in standard-time format 
    public String toStandardString() {
        DecimalFormat twoDigits = new DecimalFormat("00");

        return ((hour == 12 || hour == 0) ? 12 : hour % 12) + ":"
                + twoDigits.format(minute) + ":" + twoDigits.format(second)
                + (hour < 12 ? " AM" : " PM");
    }
} // end class Time