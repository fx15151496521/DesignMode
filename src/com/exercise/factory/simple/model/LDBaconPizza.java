package com.exercise.factory.simple.model;

/**
 * @Description: LD bacon pizza
 * @Date: 2020/1/9 17:03
 * @author xfei
 */
public class LDBaconPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare LD bacon pizza materials!");
    }
}
