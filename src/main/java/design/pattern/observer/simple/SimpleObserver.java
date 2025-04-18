package design.pattern.observer.simple;

public class SimpleObserver implements Observer {

    private int value;
    Subject subject;

    public SimpleObserver(Subject s) {
        this.subject = s;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}
