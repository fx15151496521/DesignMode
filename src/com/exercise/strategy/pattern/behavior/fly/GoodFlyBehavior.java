package com.exercise.strategy.pattern.behavior.fly;

/**
 * @Description:
 * @Date: 2019/12/3 15:21
 * @author: xfei
 */
public class GoodFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("*** Good fly~ ***");
    }
}
