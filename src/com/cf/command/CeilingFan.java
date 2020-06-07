package com.cf.command;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/6 22:08
 */
public class CeilingFan {

    String location;
    int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(location + " celling fan is on high");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location + " celling fan is on medium");
    }

    public void low(){
        speed = LOW;
        System.out.println(location + " celling fan is on low");
    }

    public void off(){
        speed = OFF;
        System.out.println(location + " celling fan is off");
    }

    public int getSpeed(){
        return speed;
    }
}
