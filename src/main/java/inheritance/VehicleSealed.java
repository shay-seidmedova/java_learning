package inheritance;

public sealed class VehicleSealed permits CarNonSealed, TruckNonSealed, ElectricTruck{
    String brand;
    int year;

    public VehicleSealed(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String getDetails() {
        return String.format("Brand: %s, Year: %d", brand, year);
    }
}
