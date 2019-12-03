package com.exercise.strategy.pattern.model;

import com.exercise.strategy.pattern.behavior.fly.FlyBehavior;
import com.exercise.strategy.pattern.behavior.quack.QuackBehavior;

/**
 * @Description:
 * @Date: 2019/12/3 15:01
 * @author: xfei
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    /**
     * 飞行
     */
    public void fly() {
        flyBehavior.fly();
    }

    /**
     * 叫声
     */
    public void quack() {
        quackBehavior.quack();
    }

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("*** is swim~ ***");
    }

    /**
     * 变更飞行行为簇
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 变更叫声行为簇
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
