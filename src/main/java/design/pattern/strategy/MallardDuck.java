package design.pattern.strategy;

import design.pattern.strategy.algorithm.fly.FlyWithWings;
import design.pattern.strategy.algorithm.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
