package design.pattern.decorator.coffee;
 
public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double getCost() {
		return .10 + beverage.getCost();
	}
}
