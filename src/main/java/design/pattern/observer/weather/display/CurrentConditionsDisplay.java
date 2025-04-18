package design.pattern.observer.weather.display;

import design.pattern.observer.weather.Observer;
import design.pattern.observer.weather.Subject;

public class CurrentConditionsDisplay implements Display, Observer {

    private float temperature;
    private float humidity;
    Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
