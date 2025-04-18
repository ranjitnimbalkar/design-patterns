package design.pattern.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {

    private List<Observer> observers;
    private int value;

    public SimpleSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(value));
    }

    public void setValue(int newValue) {
        this.value = newValue;
        notifyObservers();
    }
}
