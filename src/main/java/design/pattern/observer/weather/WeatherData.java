package design.pattern.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Observer> observes;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observes = new ArrayList<>();
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observes.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observes.forEach(observer -> observer.update(temperature, humidity, pressure));
    }
}
