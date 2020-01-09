package com.exercise.factory.abstractF.model;

/**
 * @Author: FeiXiang
 * @Description: pizza的抽象类
 * @Date: Created in 20:41 2020-01-09
 * @Modifid By:
 */
public abstract class AbstractPizza {

    private String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(getName() + " bake pizza...");
    }

    public void cut() {
        System.out.println(getName() + " cut pizza...");
    }

    public void box() {
        System.out.println(getName() + " package pizza...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
