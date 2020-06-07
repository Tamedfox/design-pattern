package com.cf.command;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/6 22:31
 */
public class GarageDoor {

    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up(){
        System.out.println(location + " garage door is Down");
    }

    public void down(){
        System.out.println(location + " garage door is down");
    }
}
