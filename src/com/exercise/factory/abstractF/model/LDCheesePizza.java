package com.exercise.factory.abstractF.model;

/**
 * @Author: FeiXiang
 * @Description:
 * @Date: Created in 20:45 2020-01-09
 * @Modifid By:
 */
public class LDCheesePizza extends AbstractPizza {

    @Override
    public void prepare() {
        System.out.println("prepare LD cheese pizza materials!");
    }
}
