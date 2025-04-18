package design.pattern.observer.weather.display;

import design.pattern.observer.weather.Observer;
import design.pattern.observer.weather.Subject;

public class ForecastDisplay implements Display, Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;
    Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
