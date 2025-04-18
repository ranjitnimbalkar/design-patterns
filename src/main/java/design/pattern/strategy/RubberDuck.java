package design.pattern.strategy;

import design.pattern.strategy.algorithm.fly.FlyBehavior;
import design.pattern.strategy.algorithm.fly.FlyNoWay;
import design.pattern.strategy.algorithm.quack.QuackBehavior;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        //quackBehavior = new Squeak();
        quackBehavior = () -> System.out.println("Squeak");
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}