package design.pattern.decorator.pizza;

public class Olives extends ToppingDecorator {

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olive";
    }

    @Override
    public double cost() {
        return pizza.cost() + 70;
    }
}
