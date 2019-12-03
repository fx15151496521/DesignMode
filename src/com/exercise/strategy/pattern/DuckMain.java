package com.exercise.strategy.pattern;

import com.exercise.strategy.pattern.behavior.quack.GaGaQuackBehavior;
import com.exercise.strategy.pattern.model.Duck;
import com.exercise.strategy.pattern.model.GreenHeadDuck;
import com.exercise.strategy.pattern.model.RedHeadDuck;

/**
 * @Description:
 * @Date: 2019/12/3 15:52
 * @author: xfei
 */
public class DuckMain {

    public static void main(String[] args) {
        Duck greenHeadDuck = new GreenHeadDuck();

        Duck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.display();
        greenHeadDuck.fly();
        greenHeadDuck.quack();

        redHeadDuck.display();
        redHeadDuck.fly();
        redHeadDuck.quack();

        redHeadDuck.setQuackBehavior(new GaGaQuackBehavior());
        redHeadDuck.quack();
    }
}
