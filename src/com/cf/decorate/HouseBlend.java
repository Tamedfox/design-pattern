package com.cf.decorate;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/5 22:57
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
