package Shape;

public class ThreeDimensionalShape extends Shape {

    private double z;

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public abstract double area();

    public abstract double volume();

}
