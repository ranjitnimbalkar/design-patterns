package design.pattern.decorator.coffee;

import design.pattern.decorator.coffee.components.DarkRoast;
import design.pattern.decorator.coffee.components.Espresso;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.getCost());

        Beverage beverage1 = new DarkRoast();
        beverage1.setSize(Beverage.Size.VENTI);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()
                + " $" + beverage1.getCost());


    }

}
