package Shape;

import java.lang.Math;

public class Square extends TwoDimensionalShape {

    public double area(double a) {
        return Math.pow(a, 2);
    }

    public double perimeter(double a) {
        return 4 * a;
    }
}
