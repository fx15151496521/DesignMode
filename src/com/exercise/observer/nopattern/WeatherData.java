package com.exercise.observer.nopattern;

/**
 * @Description:
 * @Date: 2019/12/3 16:23
 * @author: xfei
 */
public class WeatherData {

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    private CurrentCondition currentCondition;

    public WeatherData(CurrentCondition currentCondition) {
        this.currentCondition = currentCondition;
    }

    public float getmTemperatrue() {
        return mTemperatrue;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void dataChange() {
        currentCondition.update(getmTemperatrue(), getmPressure(), getmHumidity());
    }

    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
    }
}
