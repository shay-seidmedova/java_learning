package inheritance;


public class VehicleTester {
    public static void main(String[] args) {
        CarNonSealed car = new CarNonSealed("Honda", 2000, 4);
        System.out.println(car.getDetails());

        TruckNonSealed truck = new TruckNonSealed("Toyota", 2005, 1000);
        System.out.println(truck.getDetails());

        ElectricTruck etruck = new ElectricTruck("Rivian", 2022, 500);
        System.out.println(etruck.getDetails());
    }
}
