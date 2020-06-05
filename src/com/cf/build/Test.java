package com.cf.build;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/5 15:11
 */
public class Test {

    public static void main(String[] args) {

        KFCWaiter waiter = new KFCWaiter(new MealA());
        Meal meal = waiter.construct();
        System.out.println(meal);
    }

}
