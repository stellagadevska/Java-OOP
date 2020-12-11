package vehicles.extended;

public class Truck extends Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 1.6;

    public Truck(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption + AIR_CONDITIONER_ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double litres) {
        super.refuel(litres * 0.95);
    }
}
