package com.exercise.command.method;

/**
 * @Description: 命令接口
 * @Date: 2020/1/15 14:42
 */
public interface Command {

    void execute();

    void undo();
}
