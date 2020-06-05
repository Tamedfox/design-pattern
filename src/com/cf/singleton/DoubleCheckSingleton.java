package com.cf.singleton;

/**
 * 懒汉式-双重校验锁单例--线程安全
 * @author cf
 * @version 1.0
 * @date 2020/5/4 15:58
 */
public class DoubleCheckSingleton {

    //volatile保证内存可见以及防止指令重排
    private volatile static DoubleCheckSingleton uniqueSingleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance(){
        //检查实例是否存在，不存在则加锁创建实例
        if(uniqueSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                //加锁后，再次检查是否为存在，不存在则创建实例
                if (uniqueSingleton == null){
                    return new DoubleCheckSingleton();
                }
            }
        }
        return uniqueSingleton;
    }
}
