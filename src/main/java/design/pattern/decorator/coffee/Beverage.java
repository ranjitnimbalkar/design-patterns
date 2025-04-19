package design.pattern.decorator.coffee;

public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();

}
