package design.pattern.decorator.coffee;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double getCost() {
		double cost = beverage.getCost();
		if (beverage.getSize() == Size.TALL) {
			cost += 10;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += 15;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += 20;
		}
		return cost;
	}
}
