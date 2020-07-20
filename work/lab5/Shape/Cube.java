package Shape;

public class Cube extends ThreeDimensionalShape{

    public double area(double a) {
        return 6 * Math.pow(a, 2);
    }

    public double volume(double a) {
        return Math.pow(a, 3);
    }
}
