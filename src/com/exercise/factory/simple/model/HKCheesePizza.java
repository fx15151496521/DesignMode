package com.exercise.factory.simple.model;

/**
 * @Author: FeiXiang
 * @Description: HK cheese pizza
 * @Date: Created in 20:31 2020-01-09
 */
public class HKCheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("prepare HK cheese pizza materials!");
    }
}
