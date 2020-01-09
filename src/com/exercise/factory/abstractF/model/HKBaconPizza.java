package com.exercise.factory.abstractF.model;

/**
 * @Author: FeiXiang
 * @Description: HK bacon pizza
 * @Date: Created in 20:32 2020-01-09
 * @Modifid By:
 */
public class HKBaconPizza extends AbstractPizza {

    @Override
    public void prepare() {
        System.out.println("prepare HK bacon pizza materials!");
    }
}
