package com.cf.command;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/6 22:12
 */
public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH){

        }
    }
}
