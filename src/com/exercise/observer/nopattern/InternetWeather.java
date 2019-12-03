package com.exercise.observer.nopattern;

/**
 * @Description:
 * @Date: 2019/12/3 16:23
 * @author: xfei
 */
public class InternetWeather {

    public static void main(String[] args) {
        CurrentCondition currentCondition = new CurrentCondition();
        WeatherData weatherData = new WeatherData(currentCondition);

        weatherData.setData(30, 150, 40);
        weatherData.dataChange();
    }
}
