package com.exercise.strategy.pattern.behavior.quack;

/**
 * @Description:
 * @Date: 2019/12/3 15:29
 */
public class GuGuQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("*** gugu叫 ***");
    }
}
