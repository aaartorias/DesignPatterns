package PushModel;

import java.util.ArrayList;

public class WeatherData implements IPublisher {
    private ArrayList<IObserver> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(IObserver observer) {
        System.out.println("Removing observer : " + observer.toString());
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    void measurementsChanged() {
        notifyObservers();
    }


}
