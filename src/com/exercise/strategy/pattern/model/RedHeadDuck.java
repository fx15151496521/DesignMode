package com.exercise.strategy.pattern.model;

import com.exercise.strategy.pattern.behavior.fly.BadFlyBehavior;
import com.exercise.strategy.pattern.behavior.quack.GuGuQuackBehavior;

/**
 * @Description:
 * @Date: 2019/12/3 15:49
 * @author: xfei
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GuGuQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("*** Red Head Duck ***");
    }
}
