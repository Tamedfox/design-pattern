package com.cf.observer;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/22 22:48
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String:" + Integer.toOctalString(subject.getState()));
    }
}
