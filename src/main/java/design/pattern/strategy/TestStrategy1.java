package design.pattern.strategy;

import design.pattern.strategy.algorithm.fly.FlyBehavior;
import design.pattern.strategy.algorithm.fly.FlyRocketPowered;
import design.pattern.strategy.algorithm.quack.QuackBehavior;

public class TestStrategy1 {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();

        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck	rubberDuck = new RubberDuck(cantFly, squeak);

        DecoyDuck	decoy = new DecoyDuck();
        Duck model = new ModelDuck();

        mallardDuck.performQuack();
        rubberDuck.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }

}
