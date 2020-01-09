package com.exercise.factory.abstractF.model;

/**
 * @Author: FeiXiang
 * @Description: HK cheese pizza
 * @Date: Created in 20:31 2020-01-09
 */
public class HKCheesePizza extends AbstractPizza{

    @Override
    public void prepare() {
        System.out.println("prepare HK cheese pizza materials!");
    }
}
