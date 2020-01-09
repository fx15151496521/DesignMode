package com.exercise.factory.simple.model;

/**
 * @Description:
 * @Date: 2019/12/6 15:17
 * @author: xfei
 */
public abstract class Pizza {

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
