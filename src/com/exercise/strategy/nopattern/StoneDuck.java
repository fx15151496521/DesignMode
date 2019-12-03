package com.exercise.strategy.nopattern;

/**
 * @Description: 后加类型：石头鸭
 * @Date: 2019/12/3 13:59
 * @author: xfei
 */
public class StoneDuck extends Duck {

    @Override
    public void display() {
        System.out.println("*** 石头鸭子 ***");
    }

    @Override
    public void quack() {
        System.out.println("*** 石头鸭子不会叫 ***");
    }

    @Override
    public void swim() {
        System.out.println("*** no swim! ***");
    }

    @Override
    public void fly() {
        System.out.println("*** no fly! ***");
    }
}
