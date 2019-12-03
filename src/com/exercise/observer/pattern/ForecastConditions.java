package com.exercise.observer.pattern;

/**
 * @Description: 预测公告板
 * @Date: 2019/12/3 17:08
 * @author: xfei
 */
public class ForecastConditions implements Observer {

    private float mTemperatrue;

    private float mPressure;

    private float mHumidity;

    @Override
    public void update(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }

    public void display() {
        System.out.println("*** Tomorrow Temperatrue: " + this.mTemperatrue * 10 + "***");
        System.out.println("*** Tomorrow Pressure: " + this.mPressure * 10 + "***");
        System.out.println("*** Tomorrow Humidity: " + this.mHumidity * 10 + "***");
    }
}
