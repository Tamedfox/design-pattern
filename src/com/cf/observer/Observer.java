package com.cf.observer;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/22 22:43
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
