package design.pattern.decorator.coffee.components;

import design.pattern.decorator.coffee.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
