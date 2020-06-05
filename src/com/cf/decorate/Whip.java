package com.cf.decorate;

/**
 * @author cf
 * @version 1.0
 * @date 2020/6/5 23:06
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
