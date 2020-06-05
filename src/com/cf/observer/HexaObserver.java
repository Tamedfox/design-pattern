package com.cf.observer;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/22 22:49
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String:" + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
