package PullModel;

import java.util.LinkedList;
import java.util.Queue;

public class StatisticsDisplay implements IDisplay, IObserver {
    private IPublisher publisher;
    private double temperature;
    private Queue<Double> temperatureQueue;
    private final int maxDays;
    private int dayCount;
    private double totalTemperature;
    private String name;

    public StatisticsDisplay() {
        temperatureQueue = new LinkedList<>();
        maxDays = 3;
        dayCount = 0;
        totalTemperature = 0;
        name = "Statistics Display";
        publisher = null;
    }

    @Override
    public void display() {
        dayCount = dayCount+1;
        if (dayCount > maxDays) {
            double oldestTemperature = (double)temperatureQueue.peek();
            totalTemperature = totalTemperature - oldestTemperature;
        }
        temperatureQueue.add(temperature);
        totalTemperature = totalTemperature + temperature;
        double avgTemperature = totalTemperature / (dayCount > maxDays ? maxDays : dayCount);
        System.out.println("Statistics Display : Avg temperature = " + avgTemperature);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void update(IPublisher publisher, Object args) {
        if (args != null && publisher instanceof WeatherData) {
            this.temperature = ((WeatherData) publisher).getTemperature();
            display();
        }
    }

    public void setPublisher(IPublisher publisher) {
        this.publisher = publisher;
        this.publisher.register(this);
    }

    public void removePublisher() {
        publisher.deregister(this);
        publisher = null;
    }

    public String getName() {
        return name;
    }

     public void updateDisplay() {
        if (publisher != null) {
            this.temperature = temperature;
            display();
        } else  {
            System.out.println(name + " : " + "Display Error: Not receiving any data");
        }
    }
}