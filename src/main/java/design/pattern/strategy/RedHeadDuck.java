package design.pattern.strategy;

import design.pattern.strategy.algorithm.fly.FlyWithWings;
import design.pattern.strategy.algorithm.quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}