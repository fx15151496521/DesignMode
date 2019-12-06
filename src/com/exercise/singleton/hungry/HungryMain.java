package com.exercise.singleton.hungry;

/**
 * @Description:
 * @Date: 2019/12/6 13:49
 */
public class HungryMain {

    public static void main(String[] args) {
        SingletonHungry hungry1 = SingletonHungry.getInstance();
        SingletonHungry hungry2 = SingletonHungry.getInstance();

        System.out.println(hungry1 == hungry2);
    }
}
