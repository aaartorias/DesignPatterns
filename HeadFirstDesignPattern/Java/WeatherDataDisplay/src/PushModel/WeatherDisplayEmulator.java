package PushModel;

public class WeatherDisplayEmulator {

    public static void main(String[] args) {
        WeatherData publisher = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        forecastDisplay.setPublisher(publisher);
        currentConditionsDisplay.setPublisher(publisher);
        statisticsDisplay.setPublisher(publisher);

        publisher.setMeasurements(20,40,50);
        publisher.setMeasurements(30,50,50);
        publisher.setMeasurements(20,40,50);

        currentConditionsDisplay.removePublisher();
        publisher.setMeasurements(40,40,50);

    }
}
