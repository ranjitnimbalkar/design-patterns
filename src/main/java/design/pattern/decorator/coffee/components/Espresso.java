package design.pattern.decorator.coffee.components;

import design.pattern.decorator.coffee.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double getCost() {
        return 1.99;
    }
}
