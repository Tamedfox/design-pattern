package com.cf.build;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/5 15:07
 */
public abstract class MealBuilder {

    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }
}
