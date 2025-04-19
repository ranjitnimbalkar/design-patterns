package design.pattern.decorator.coffee;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double getCost() {
		return 1.05;
	}
}

