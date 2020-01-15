package com.exercise.command.method;

import com.exercise.command.model.Stereo;

/**
 * @Description:
 * @Date: 2020/1/15 16:46
 */
public class StereoAddVolCommand implements Command {

    private Stereo stereo;

    public StereoAddVolCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        int vol = this.stereo.getVol();
        if (vol < 11) {
            this.stereo.setVol(++ vol);
        }
    }

    @Override
    public void undo() {
        int vol = this.stereo.getVol();
        if (vol > 0) {
            this.stereo.setVol(-- vol);
        }
    }
}
