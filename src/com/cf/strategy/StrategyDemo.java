package com.cf.strategy;

import com.cf.strategy.behavior.MuteQuack;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/31 18:45
 */
public class StrategyDemo {

    public static void main(String[] args) {
        MalloardDuck malloardDuck = new MalloardDuck();
        malloardDuck.performFly();
        malloardDuck.performQuack();
        System.out.println("----------------------");
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println("----------------------");
        //动态设定功能
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.performQuack();
    }

}
