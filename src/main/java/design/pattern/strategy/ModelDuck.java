package design.pattern.strategy;

import design.pattern.strategy.algorithm.fly.FlyNoWay;
import design.pattern.strategy.algorithm.quack.Quack;

public class ModelDuck extends Duck {

   public ModelDuck() {
       flyBehavior = new FlyNoWay();
       quackBehavior = new Quack();
   }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
