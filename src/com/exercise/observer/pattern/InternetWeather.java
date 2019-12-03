package com.exercise.observer.pattern;


/**
 * @Description: 测试
 * @Date: 2019/12/3 17:09
 * @author: xfei
 */
public class InternetWeather {

    public static void main(String[] args) {

        Observer currentCondition = new CurrentConditions();
        Observer forecastConditions = new ForecastConditions();

        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(currentCondition);
        weatherData.registerObserver(forecastConditions);

        weatherData.setWeatherData(30, 150, 40);
        weatherData.removeObserver(forecastConditions);
        weatherData.setWeatherData(30, 140, 40);
    }
}
