package com.cf.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/22 22:43
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
