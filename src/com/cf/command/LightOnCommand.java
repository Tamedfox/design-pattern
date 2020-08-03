package com.cf.command;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/6 21:16
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
