package com.chapter2.OberverPatternByJavaAPI;

import com.chapter2.observerpattern.CurrentConditionsDisplay;
import com.chapter2.observerpattern.WeatherData;

/**
 * Created by qizhenfang on 17/8/6.
 */
public class WeatherStation {
    public static void main(String[] args) {
        com.chapter2.observerpattern.WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        currentConditionsDisplay.display();

        weatherData.setMeasurements(80, 75, 30.4f);
        weatherData.setMeasurements(82, 74, 31.4f);
        weatherData.setMeasurements(87, 78, 30.5f);
    }
}
