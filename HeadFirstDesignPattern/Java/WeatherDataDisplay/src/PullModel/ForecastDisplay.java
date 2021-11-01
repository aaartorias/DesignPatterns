package PullModel;

public class ForecastDisplay implements IDisplay, IObserver {
    private IPublisher publisher;
    private double temperature;
    private double humidity;
    private double prevTemperature;
    private double prevHumidity;
    private String name;


    public ForecastDisplay() {
        prevTemperature = 0;
        prevHumidity = 0;
        name = "Forecast Display";
        publisher = null;
    }

    @Override
    public void display() {
        String message;
        if (prevHumidity < humidity && prevTemperature < temperature) {
            message = "It's going to be hot folks!!!";
        } else if ( prevHumidity > humidity && prevTemperature > temperature) {
            message = "It's getting colder!!!";
        } else {
            message = "It's a wonderful day!!!";
        }

        System.out.println("Forecast Display : " + message);
        prevHumidity = humidity;
        prevTemperature = temperature;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        if (publisher != null) {
            this.temperature = temperature;
            this.humidity = humidity;
            display();
        } else  {
            System.out.println(name + " : " + "Display Error: Not receiving any data");
        }

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
        this.temperature = ((WeatherData) publisher).getTemperature();
        this.humidity = ((WeatherData) publisher).getHumidity();
        display();
    }
}
