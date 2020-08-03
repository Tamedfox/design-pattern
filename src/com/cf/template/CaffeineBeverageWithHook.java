package com.cf.template;

/**
 * @author cf
 * @version 1.0
 * @date 2020/8/3 20:34
 */
public abstract class CaffeineBeverageWithHook {

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
