package inheritance;

public non-sealed class TruckNonSealed extends VehicleSealed{

    public double cargoWeight;

    public TruckNonSealed(String brand, int year, double cargoWeight) {
        super(brand, year);
        this.cargoWeight = cargoWeight;
    }

    @Override
    String getDetails() {
        return super.getDetails() + String.format(", Cargo Weight: %.2f", cargoWeight);
    }
}
