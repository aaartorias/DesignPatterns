package PushModel;

public class ForecastDisplay implements IDisplay,IObserver{
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
