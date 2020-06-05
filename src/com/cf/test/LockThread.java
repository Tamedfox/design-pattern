package com.cf.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/5 18:15
 */
public class LockThread {

    public static void main(String[] args) {
        final List<Integer> list1 = Arrays.asList(0,2,4,6);
        final List<Integer> list2 = Arrays.asList(1,3,5,7);
        Thread t1 = new Thread(() -> {
           synchronized (list1){
               for (Integer integer : list1) {
                   System.out.println(integer);
               }
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (list2){
                   for (Integer integer : list2) {
                       System.out.println(integer);
                   }
               }
           }
        });

        Thread t2 = new Thread(() -> {
           synchronized (list2){
               for (Integer integer : list2) {
                   System.out.println(integer);
               }
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (list1){
                   for (Integer integer : list1) {
                       System.out.println(integer);
                   }
               }
           }
        });

        t1.start();
        t2.start();
    }

}
