package com.exercise.strategy.nopattern;

/**
 * @Description: 红头鸭
 * @Date: 2019/12/3 13:57
 * @author: xfei
 */
public class RedHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("*** 鸭子的头是红色的 ***");
    }

    @Override
    public void fly() {
        System.out.println("*** is fly~ ***");
    }
}
