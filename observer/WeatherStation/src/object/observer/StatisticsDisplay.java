package object.observer;

import object.display.DisplayElement;
import subject.Subject;
import subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemperature = 1000f;
    private float maxTemperature = 0f;
    private float sumTemperature = 0f;
    private int numReadings = 0;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (sumTemperature / numReadings)
                + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        sumTemperature += temperature;
        numReadings++;
        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }
        if (temperature < minTemperature) {
            minTemperature = temperature;
        }
        display();
    }
}
