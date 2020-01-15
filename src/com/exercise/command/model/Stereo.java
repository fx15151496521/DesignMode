package com.exercise.command.model;

/**
 * @Description:
 * @Date: 2020/1/15 14:27
 */
public class Stereo {

    private int vol;

    public void on() {
        System.out.println("Stereo turn on.");
    }

    public void off() {
        System.out.println("Stereo turn off.");
    }

    public void setCD() {
        System.out.println("Stereo set CD.");
    }

    public int getVol() {
        return this.vol;
    }

    public void setVol(int vol) {
        this.vol += vol;
    }
}
