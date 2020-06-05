package com.cf.singleton;

/**
 * 饿汉式单例模式---线程安全
 * @author cf
 * @version 1.0
 * @date 2020/5/4 15:52
 */
public class HungerSingleton {

    private static HungerSingleton uniqueInstance = new HungerSingleton();

    //私有化构造方法，防止其他人通过new创建新的对象
    private HungerSingleton(){
    }

    public static HungerSingleton getInstance(){
        return uniqueInstance;
    }

}
