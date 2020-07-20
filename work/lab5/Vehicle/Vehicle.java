package Vehicle;

public abstract class Vehicle {

    private String manufacturer;
    private String model;
    private double price;
    private int maxSpeed;
    private int numWheels;

    public Vehicle(String manufacturer, String model, double price, int maxSpeed, int numWheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public String toString() {
        return "Manufacturer: " + manufacturer
                + "\nModel: " + model
                + "\nPrice: " + price
                + "\nMax speed: " + maxSpeed
                + "\nNumber of wheels: " + numWheels;
    }

}
