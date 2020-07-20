package Vehicle;

public class MotorCycle extends Vehicle {

    private String seat;

    public MotorCycle(String manufacturer, String model, double price, int maxSpeed, int numWheels, String seat) {
        super(manufacturer, model, price, maxSpeed, numWheels);
        setSeat(seat);
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getSeat() {
        return seat;
    }

    public String toString() {
        return "-----Motorcycle-----\n"
                + super.toString()
                + "\nSeat type: " + seat;
    }

}
