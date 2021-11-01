package PullModel;

import java.util.ArrayList;

public class WeatherData implements IPublisher {
    private ArrayList<IObserver> observers;
    private double temperature;
    private double humidity;

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    private double pressure;
    private boolean hasChanged;

    public WeatherData() {
        observers = new ArrayList<>();
        hasChanged = false;
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
        notifyObservers(null);
    }

    @Override
    public void notifyObservers(Object args) {
        if (hasChanged) {
            for (IObserver observer: observers) {
                observer.update(this,args);
            }
            hasChanged = false;
        }
    }

    @Override
    public void setChanged() {
        hasChanged = true;
        notifyObservers();
    }

    void measurementsChanged(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }
}
