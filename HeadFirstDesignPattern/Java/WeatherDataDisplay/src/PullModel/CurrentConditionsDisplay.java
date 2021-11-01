package PullModel;

public class CurrentConditionsDisplay implements IDisplay, IObserver {
    private IPublisher publisher;
    private double temperature;
    private double humidity;
    private String name;

    public CurrentConditionsDisplay() {
        name = "Current Conditions Display";
        publisher = null;
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

    @Override
    public void update(IPublisher publisher, Object args) {
        if (args != null && publisher instanceof WeatherData) {
            this.temperature = ((WeatherData) publisher).getTemperature();
            this.humidity = ((WeatherData) publisher).getHumidity();
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
            this.humidity = humidity;
            display();
        } else  {
            System.out.println(name + " : " + "Display Error: Not receiving any data");
        }
    }
}