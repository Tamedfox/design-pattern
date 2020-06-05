package com.cf.strategy.behavior;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/31 17:11
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }

}
