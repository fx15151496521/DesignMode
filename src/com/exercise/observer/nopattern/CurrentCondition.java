package com.exercise.observer.nopattern;

/**
 * @Description:
 * @Date: 2019/12/3 16:23
 * @author: xfei
 */
public class CurrentCondition {

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    public void update(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }

    public void display() {
        System.out.println("*** Today Temperature: " + this.mTemperatrue + " ***");
        System.out.println("*** Today Pressure: " + this.mPressure + " ***");
        System.out.println("*** Today Humidity: " + this.mHumidity + " ***");
    }
}
