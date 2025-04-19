package design.pattern.decorator.coffee;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	public double getCost() {
		return .20 + beverage.getCost();
	}
}
