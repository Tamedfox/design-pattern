package com.cf.decorate;


/**
 * @author cf
 * @version 1.0
 * @date 2020/6/5 23:02
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $:" + beverage.cost());
    }

}
