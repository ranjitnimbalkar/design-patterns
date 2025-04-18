package design.pattern.strategy.algorithm.quack;

public class FakeQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Qwak");
    }
}
