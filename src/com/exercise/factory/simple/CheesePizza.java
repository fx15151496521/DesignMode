package com.exercise.factory.simple;

/**
 * @Description: cheese pizza
 * @Date: 2020/1/9 17:02
 * @author xfei
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare cheese pizza materials!");
    }
}
