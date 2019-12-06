package com.exercise.singleton.hungry;

/**
 * @Description:
 * @Date: 2019/12/6 13:47
 * @author: xfei
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {}

    public static SingletonHungry getInstance() {
        return instance;
    }
}
