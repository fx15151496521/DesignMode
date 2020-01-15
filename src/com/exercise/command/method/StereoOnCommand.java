package com.exercise.command.method;

import com.exercise.command.model.Stereo;

/**
 * @Description:
 * @Date: 2020/1/15 16:34
 */
public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCD();
    }

    @Override
    public void undo() {
        this.stereo.off();
    }
}
