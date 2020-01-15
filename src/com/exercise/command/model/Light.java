package com.exercise.command.model;

/**
 * @Description:
 * @Date: 2020/1/15 14:27
 */
public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " turn on.");
    }

    public void off() {
        System.out.println(this.name + " turn off.");
    }
}
