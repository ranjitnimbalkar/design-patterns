package design.pattern.decorator.coffee;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double getCost() {
		return .15 + beverage.getCost();
	}
}
