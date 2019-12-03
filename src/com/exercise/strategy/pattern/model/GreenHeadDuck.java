package com.exercise.strategy.pattern.model;

import com.exercise.strategy.pattern.behavior.fly.FlyBehavior;
import com.exercise.strategy.pattern.behavior.fly.GoodFlyBehavior;
import com.exercise.strategy.pattern.behavior.quack.GaGaQuackBehavior;
import com.exercise.strategy.pattern.behavior.quack.QuackBehavior;

/**
 * @Description: 绿头鸭
 * @Date: 2019/12/3 15:32
 * @author: xfei
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("*** Green Head Duck ***");
    }

}
