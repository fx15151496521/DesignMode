package com.exercise.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 气象台
 * @Date: 2019/12/3 16:59
 * @author: xfei
 */
public class WeatherData implements Subject {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    public List<Observer> list;

    public WeatherData() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (list.contains(observer)) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        list.stream().forEach(obs -> {
            obs.update(getmTemperature(), getmPressure(), getmHumidity());
        });
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void dataChange() {
        this.notifyObserver();
    }

    /**
     * 添加天气信息
     * @param mTemperature
     * @param mPressure
     * @param mHumidity
     */
    public void setWeatherData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        this.dataChange();
    }
}
