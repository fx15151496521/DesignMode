package com.exercise.factory.simple.model;

/**
 * @Description: LD cheese pizza
 * @Date: 2020/1/9 17:02
 * @author xfei
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare LD cheese pizza materials!");
    }
}
