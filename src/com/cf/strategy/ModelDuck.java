package com.cf.strategy;

import com.cf.strategy.behavior.FlyNoWay;
import com.cf.strategy.behavior.Quack;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/31 18:44
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void displayy() {
        System.out.println("I'm a model duck");
    }
}
