package com.exercise.factory.simple;

/**
 * @Description: bacon pizza
 * @Date: 2020/1/9 17:03
 * @author xfei
 */
public class BaconPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare bacon pizza materials!");
    }
}
