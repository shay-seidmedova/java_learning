package inheritance;

public non-sealed class CarNonSealed extends VehicleSealed{
    int doors;

    public CarNonSealed(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    String getDetails() {
        return super.getDetails() + String.format(", Doors: %d", doors);
    }
}
