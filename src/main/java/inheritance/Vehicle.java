package inheritance;

public class Vehicle {
    private String type;
    private int numberOfWheels;
    private int maxSpeed;

    // Default
    public Vehicle() {
        System.out.println("In Vehicle default constructor");
        this.type = "No type";
        this.numberOfWheels = 4;
        this.maxSpeed = 0;
    }

    // AllArgs || Parametrized
    public Vehicle(String type, int numberOfWheels, int maxSpeed) {
        System.out.println("In Vehicle param constructor");
        this.type = type;
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    public String displayInfo() {
        String message = String.format("Vehicle information:\n Type: %s\n Number of wheels: %d\n Max speed: %d", type, numberOfWheels, maxSpeed);
        System.out.println(message);
        return message;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
