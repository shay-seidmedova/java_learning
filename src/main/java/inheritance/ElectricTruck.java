package inheritance;

public non-sealed class ElectricTruck extends VehicleSealed {

    public double batteryCapacity;

    public ElectricTruck(String brand, int year, double batteryCapacity) {
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    String getDetails() {
        return super.getDetails() + String.format(", Battery Capacity: %.2f", batteryCapacity);
    }
}
