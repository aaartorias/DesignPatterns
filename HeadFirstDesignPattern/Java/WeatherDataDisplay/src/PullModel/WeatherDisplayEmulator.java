package PullModel;

public class WeatherDisplayEmulator {

    public static void main(String[] args) {
        WeatherData publisher = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        forecastDisplay.setPublisher(publisher);
        currentConditionsDisplay.setPublisher(publisher);
        statisticsDisplay.setPublisher(publisher);

        publisher.measurementsChanged(20,40,50);
        publisher.measurementsChanged(30,50,50);
        publisher.measurementsChanged(20,40,50);

        currentConditionsDisplay.updateDisplay();
        forecastDisplay.updateDisplay();
        statisticsDisplay.updateDisplay();

        currentConditionsDisplay.removePublisher();

        currentConditionsDisplay.updateDisplay();
        forecastDisplay.updateDisplay();
        statisticsDisplay.updateDisplay();

        publisher.measurementsChanged(40,40,50);

        currentConditionsDisplay.updateDisplay();
        forecastDisplay.updateDisplay();
        statisticsDisplay.updateDisplay();
    }
}
