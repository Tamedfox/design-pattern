package com.cf.decorate;

/**
 * 抽象组件
 * @author cf
 * @version 1.0
 * @date 2020/6/5 22:26
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
