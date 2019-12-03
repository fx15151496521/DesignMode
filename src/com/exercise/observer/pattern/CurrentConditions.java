package com.exercise.observer.pattern;

/**
 * @Description: 当前公告板
 * @Date: 2019/12/3 16:55
 * @author: xfei
 */
public class CurrentConditions implements Observer {

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
        System.out.println("*** Today Temperatrue: " + this.mTemperatrue + "***");
        System.out.println("*** Today Pressure: " + this.mPressure + "***");
        System.out.println("*** Today Humidity: " + this.mHumidity + "***");
    }
}
