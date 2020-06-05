package com.cf.build;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/5 15:09
 */
public class KFCWaiter {

    private MealBuilder mealBuilder;

    public KFCWaiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        //准备drink
        mealBuilder.buildDrink();
        //准备food
        mealBuilder.buildFood();
        //准备完毕，返回套餐
        return mealBuilder.getMeal();
    }
}
