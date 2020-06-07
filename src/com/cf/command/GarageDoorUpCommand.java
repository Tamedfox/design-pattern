package com.cf.command;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/6 22:32
 */
public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
