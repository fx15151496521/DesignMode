package com.exercise.command.method;

/**
 * @Description:
 * @Date: 2020/1/15 15:29
 */
public interface Controller {

    void onCommand(int slot);

    void offCommand(int slot);

    void undoCommand();
}
