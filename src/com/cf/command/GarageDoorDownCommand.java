package com.cf.command;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/6 22:33
 */
public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
