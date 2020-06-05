package com.cf.strategy;

import com.cf.strategy.behavior.FlyWithWings;
import com.cf.strategy.behavior.Quack;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/31 18:42
 */
public class MalloardDuck extends Duck {

    public MalloardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void displayy() {
        System.out.println("I'm a real Mallard duck");
    }
}
