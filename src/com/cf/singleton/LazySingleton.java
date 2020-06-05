package com.cf.singleton;

/**
 * 懒汉式-synchronized线程安全
 * @author cf
 * @version 1.0
 * @date 2020/5/4 15:55
 */
public class LazySingleton {

    private static LazySingleton uniqueInstance;

    private LazySingleton() {
    }

    //加锁防止多个线程同时获取时产生多个对象
    public static synchronized LazySingleton getInstance(){
        if(uniqueInstance == null){
            return new LazySingleton();
        }
        return uniqueInstance;
    }
}
