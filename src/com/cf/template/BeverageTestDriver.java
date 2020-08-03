package com.cf.template;

/**
 * @author cf
 * @version 1.0
 * @date 2020/8/3 20:55
 */
public class BeverageTestDriver {

    public static void main(String[] args) {
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        TeaWithHook teaHook = new TeaWithHook();

        System.out.println("\nMaking tea.....");
        coffeeHook.prepareRecipe();

        System.out.println("\nMaking coffee.....");
        teaHook.prepareRecipe();
    }

}
