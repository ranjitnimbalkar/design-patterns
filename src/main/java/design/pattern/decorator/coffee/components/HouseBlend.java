package design.pattern.decorator.coffee.components;

import design.pattern.decorator.coffee.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double getCost() {
        return 120;
    }
}
