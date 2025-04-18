package design.pattern.strategy;

import design.pattern.strategy.algorithm.fly.FlyNoWay;
import design.pattern.strategy.algorithm.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("I'm a duck Decoy");
    }

}
