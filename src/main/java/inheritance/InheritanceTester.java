package inheritance;

public class InheritanceTester {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Motorcycle", 2, 1000);
        Car car = new Car("Honda");
        System.out.println("Vehicle type " + vehicle.getType());
        System.out.println("Car brand " + car.getBrand());
        car.setType("Sedan");
        System.out.println("Car's vehicle parent type " + car.getType());
        System.out.println("Car's vehicle parent wheels " + car.getNumberOfWheels());
        System.out.println("Car's vehicle parent max speed " + car.getMaxSpeed());
        vehicle.displayInfo();

        Car motorcycle = new Car("Yamaha");
        motorcycle.setType("racing");
        motorcycle.setNumberOfWheels(3);
        motorcycle.setMaxSpeed(500);
        System.out.println("Motorcycle info:");
        System.out.println(motorcycle.getType());
        System.out.println(motorcycle.getNumberOfWheels());
        System.out.println(motorcycle.getMaxSpeed());
        System.out.println(motorcycle.getBrand());
    }
}
