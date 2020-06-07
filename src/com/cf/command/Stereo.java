package com.cf.command;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/6 21:58
 */
public class Stereo {

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " stereo is on");
    }

    public void off(){
        System.out.println(location + " stereo is off");
    }

    public void setCD(){
        System.out.println(location + " stereo is set for CD input");
    }

    public void setDVD(){
        System.out.println(location + " stereo is set for DVD input");
    }

    public void setRadio(){
        System.out.println(location + " stereo is set for Radio");
    }

    public void setVolume(int volume){
        System.out.println(location + " stereo volume set to " + volume);
    }
}
