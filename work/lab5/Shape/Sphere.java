package Shape;

import java.lang.Math;

public class Sphere extends ThreeDimensionalShape{

    public double area(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public double volume(double r) {
        return 4 / 3 * Math.PI * Math.pow(r, 3);
    }
}
