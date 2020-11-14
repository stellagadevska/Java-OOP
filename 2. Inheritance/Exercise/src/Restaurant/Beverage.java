package Restaurant;

import java.math.BigDecimal;

public class Beverage extends Product {
    private double millilitres;

    public Beverage(String name, BigDecimal price, double mililitres) {
        super(name, price);
        this.millilitres = mililitres;
    }

    public double getMillilitres() {
        return millilitres;
    }
}
