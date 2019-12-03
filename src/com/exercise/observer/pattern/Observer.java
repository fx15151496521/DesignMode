package com.exercise.observer.pattern;

/**
 * @Description: 观察者
 * @Date: 2019/12/3 16:49
 * @author: xfei
 */
public interface Observer {

    void update(float mTemperatrue, float mPressure, float mHumidity);
}
