package design.pattern.decorator.coffee;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        double cost = beverage.getCost();
        if (beverage.getSize() == Size.TALL) {
            cost += 15;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 20;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 25;
        }
        return cost;
    }
}
