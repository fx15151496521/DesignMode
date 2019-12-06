package com.exercise.singleton.lazy;

/**
 * @Description: 饿汉模式，他是天生的线程安全模式
 * @Date: 2019/12/6 13:45
 * @author: xfei
 */
public class LazyMain {

    public static void main(String[] args) {
        SingletonLazy lazy1 = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();

        System.out.println(lazy1 == lazy2);
    }
}
