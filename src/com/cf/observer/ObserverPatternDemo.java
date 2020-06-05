package com.cf.observer;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/22 22:50
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("---------------");
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
