package com.cf.command;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/6 22:07
 */
public class StereoOffCommand implements Command{

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
