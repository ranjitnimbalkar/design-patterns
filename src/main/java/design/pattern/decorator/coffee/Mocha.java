package design.pattern.decorator.coffee;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	public double getCost() {
		double cost = beverage.getCost();
		if (beverage.getSize() == Size.TALL) {
			cost +=  5;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += 10;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += 20;
		}
		return cost;
	}
}
