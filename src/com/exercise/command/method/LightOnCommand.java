package com.exercise.command.method;

import com.exercise.command.model.Light;

/**
 * @Description:
 * @Date: 2020/1/15 16:29
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}
