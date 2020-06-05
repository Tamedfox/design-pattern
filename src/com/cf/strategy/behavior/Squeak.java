package com.cf.strategy.behavior;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/31 17:15
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}
