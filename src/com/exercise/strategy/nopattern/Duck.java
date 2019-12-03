package com.exercise.strategy.nopattern;

/**
 * 模拟鸭子
 * 使用继承的方式解决以前的需求，有溢出效应
 *
 * 新的设计应对项目的延展性，降低复杂度：
 *  1）分析项目变化和不变化的不分，提取变化部分，抽象成接口+实现；
 *  2）鸭子哪些功能是会根据新需求变化的？叫声、飞行....
 *
 * @Description: 鸭子的基类
 * @Date: 2019/12/3 13:44
 * @author: xfei
 */
public abstract class Duck {

    /**
     * 模拟叫声
     */
    public void quack() {
        System.out.println("*** 鸭子gaga ***");
    }

    /**
     * 鸭子的颜色
     */
    public abstract void display();

    /**
     * 鸭子技能
     */
    public void swim(){
        System.out.println("*** 鸭子会游泳 ***");
    }

    /**
     * 后加功能
     */
    public abstract void fly();
}
