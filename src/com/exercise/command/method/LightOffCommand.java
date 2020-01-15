package com.exercise.command.method;

import com.exercise.command.model.Light;

/**
 * @Description:
 * @Date: 2020/1/15 16:32
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
