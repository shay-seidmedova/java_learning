package inheritance;

public class Car extends Vehicle{
    private String brand;

    public Car() {
        System.out.println("In Car default constructor");
        this.brand = "Toyota";
    }

    public Car(String brand) {
        super("SUV", 4, 100);
        System.out.println("In Car param constructor");
        this.brand = brand;
    }

    public String displayInfo() {
        return String.format("Info for this car:\nBrand: %s", brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
