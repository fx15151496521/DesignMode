package com.exercise.strategy.nopattern;

/**
 * @Description: 绿头鸭
 * @Date: 2019/12/3 13:55
 * @author: xfei
 */
public class GreenHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("*** 鸭子的头是绿色的 ***");
    }

    @Override
    public void fly() {
        System.out.println("*** no fly~ ***");
    }
}
