package com.cf.command;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/6 21:28
 */
public class Light {

    String location = "";

    public Light(String location){
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off(){
        System.out.println(location + " light is off");
    }

}
