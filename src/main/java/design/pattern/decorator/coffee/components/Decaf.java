package design.pattern.decorator.coffee.components;

import design.pattern.decorator.coffee.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double getCost() {
		return 1.05;
	}
}

