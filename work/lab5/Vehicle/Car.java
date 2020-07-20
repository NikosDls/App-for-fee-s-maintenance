package Vehicle;

public class Car extends Vehicle {

    private int numDoors;

    public Car(String manufacturer, String model, double price, int maxSpeed, int numWheels, int numDoors) {
        super(manufacturer, model, price, maxSpeed, numWheels);
        setNumDoors(numDoors);
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public String toString() {
        return "-----Car-----\n"
                + super.toString()
                + "\nNumber of doors: " + numDoors;
    }
}
