package com.cf.decorate;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/5 22:51
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
