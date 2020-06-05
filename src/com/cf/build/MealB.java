package com.cf.build;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/5 15:08
 */
public class MealB extends MealBuilder{


    @Override
    public void buildFood() {
        meal.setDrink("七喜");
    }

    @Override
    public void buildDrink() {
        meal.setFood("吮指原味鸡");
    }
}
