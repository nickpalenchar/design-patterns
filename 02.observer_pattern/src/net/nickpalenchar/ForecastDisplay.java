package net.nickpalenchar;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{

    private float currentPressure = 29.29f;
    private float lastPressure;

    public ForecastDisplay(Observable observer) {
        observer.addObserver(this);
    }

    public void update(Observable observable, Object args){
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
    public void display() {
        // display code here;
    }
}
