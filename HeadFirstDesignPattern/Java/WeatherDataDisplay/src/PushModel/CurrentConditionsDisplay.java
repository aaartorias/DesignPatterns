package PushModel;

public class CurrentConditionsDisplay implements IDisplay,IObserver{
    private IPublisher publisher;
    private double temperature;
    private double humidity;
    private String name;

    public CurrentConditionsDisplay() {
        name = "Current Conditions Display";
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: Temperature = " + temperature + " Humidity = " + humidity );
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void setPublisher(IPublisher publisher) {
        this.publisher = publisher;
        this.publisher.register(this);
    }

    public void removePublisher() {
        publisher.deregister(this);
    }

    public String getName() {
        return name;
    }
}