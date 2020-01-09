package com.exercise.singleton.lazy;

/**
 * @Description: 懒汉模式，非线程安全的。
 * @Date: 2019/12/6 13:42
 * @author: xfei
 */
public class SingletonLazy {

    // 双层锁结构
    private volatile static SingletonLazy instance = null;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        // 双层检查加锁
        if (instance == null) {
            // 解决懒汉模式非线程安全的问题
            synchronized (Object.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
