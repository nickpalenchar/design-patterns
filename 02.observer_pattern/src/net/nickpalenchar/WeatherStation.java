package net.nickpalenchar;

public class WeatherStation {

    public static void main(String[] args) {
	// write your code here
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.2f);
        weatherData.setMeasurements(82, 50, 32.3f);
        weatherData.setMeasurements(89, 49, 24.9f);

    }
}
