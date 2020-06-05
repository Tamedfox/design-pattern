package com.cf.test;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/5 19:34
 */
public class MyContainer<T> {

    private final LinkedList<T> list = new LinkedList<>();
    private final int MAX = 10;
    private int count = 0;

    public synchronized void put(T t){
        while(MAX == count){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(t);
        System.out.println("放入了" + t);
        count++;
        this.notifyAll();
    }

    public synchronized T get(){
        while(list.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T t = list.removeFirst();
        count--;
        this.notifyAll();
        return t;
    }

    public static void main(String[] args) {
        MyContainer<String> container = new MyContainer<>();

        //启动消费者线程
        for (int i = 0; i < 10; i++){
            new Thread(() -> {
                    System.out.println(container.get());
            },"C_" + i).start();
        }
        System.out.println("开始生产者");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //启动生产者线程
        for( int i = 0; i < 2 ; i++){
            new Thread(() -> {
                for( int j = 0; j < 1; j++){
                    container.put(Thread.currentThread().getName() + " " + j);
                }
            }, "P_" + i).start();
        }
    }

}
