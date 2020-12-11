package vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuel;
    private double consumption;

    protected Vehicle(double fuel, double consumption) {
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public String drive(double distance) {
        double fuelNeeded = distance * this.consumption;
        if (fuelNeeded > this.fuel) {
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
        this.fuel -= fuelNeeded;

        DecimalFormat formatter = new DecimalFormat("##.##");

        return String.format("%s travelled %s km",
                this.getClass().getSimpleName(),
                formatter.format(distance));
    }


    public void refuel(double litres) {
        this.fuel += litres;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuel);
    }
}
