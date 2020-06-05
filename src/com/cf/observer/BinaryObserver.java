package com.cf.observer;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/22 22:47
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String:" + Integer.toBinaryString(subject.getState()));
    }
}
