package com.cf.strategy.behavior;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/31 17:10
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
