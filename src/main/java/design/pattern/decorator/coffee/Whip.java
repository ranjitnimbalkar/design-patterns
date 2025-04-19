package design.pattern.decorator.coffee;
 
public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
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
