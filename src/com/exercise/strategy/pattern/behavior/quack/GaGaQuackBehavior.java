package com.exercise.strategy.pattern.behavior.quack;

/**
 * @Description:
 * @Date: 2019/12/3 15:28
 * @author: xfei
 */
public class GaGaQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("*** gaga叫 ***");
    }
}
