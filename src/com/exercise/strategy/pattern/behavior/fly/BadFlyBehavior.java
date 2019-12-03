package com.exercise.strategy.pattern.behavior.fly;

/**
 * @Description:
 * @Date: 2019/12/3 15:14
 */
public class BadFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("*** Bad fly~ ***");
    }
}
