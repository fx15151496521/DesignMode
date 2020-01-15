package com.exercise.command.method;

import com.exercise.command.model.Stereo;

/**
 * @Description:
 * @Date: 2020/1/15 16:50
 */
public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.off();
    }

    @Override
    public void undo() {
        this.stereo.on();
        this.stereo.setCD();
    }
}
