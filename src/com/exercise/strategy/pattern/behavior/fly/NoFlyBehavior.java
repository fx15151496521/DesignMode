package com.exercise.strategy.pattern.behavior.fly;

/**
 * @Description:
 * @Date: 2019/12/3 15:23
 * @author: xfei
 */
public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("*** No fly~ ***");
    }
}
