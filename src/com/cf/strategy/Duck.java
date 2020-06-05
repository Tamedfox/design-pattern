package com.cf.strategy;

import com.cf.strategy.behavior.FlyBehavior;
import com.cf.strategy.behavior.QuackBehavior;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/31 17:00
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void displayy();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
