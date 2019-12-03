package com.exercise.strategy.nopattern;

/**
 * @Description:
 * @Date: 2019/12/3 14:04
 */
public class DuckMain {

    public static void main(String[] args) {
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        StoneDuck stoneDuck = new StoneDuck();

        greenHeadDuck.quack();
        greenHeadDuck.swim();
        greenHeadDuck.display();
        greenHeadDuck.fly();

        redHeadDuck.quack();
        redHeadDuck.swim();
        redHeadDuck.display();
        redHeadDuck.fly();

        stoneDuck.quack();
        stoneDuck.swim();
        stoneDuck.display();
        stoneDuck.fly();
    }
}
