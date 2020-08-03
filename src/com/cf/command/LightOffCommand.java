package com.cf.command;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/6 22:45
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
