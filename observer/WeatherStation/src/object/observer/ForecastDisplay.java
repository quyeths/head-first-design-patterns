package object.observer;

import object.display.DisplayElement;
import subject.Subject;
import subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 0f;
    private float previousPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > previousPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure < previousPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        } else {
            System.out.println("More of the same");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        previousPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
