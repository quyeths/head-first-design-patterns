import observable.WeatherData;
import observer.CurrentConditionsDisplay;
import observer.ForecastDisplay;
import observer.StatisticsDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80f, 65f, 30.4f);
        weatherData.setMeasurements(82.0f, 70.0f, 29.2f);
        weatherData.setMeasurements(78.0f, 90.0f, 29.2f);
    }
}