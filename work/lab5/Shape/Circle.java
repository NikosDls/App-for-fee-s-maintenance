package Shape;

import java.lang.Math;

public class Circle extends TwoDimensionalShape {

    public double area(double r) {
        return 2 * Math.PI * Math.pow(r, 2);
    }

    public double perimeter(double r) {
        return 2 * Math.PI * r;
    }
}
