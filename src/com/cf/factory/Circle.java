package com.cf.factory;

/**
 * 圆形
 * @author cf
 * @version 1.0
 * @date 2020/5/4 16:10
 */
public class Circle implements Shape {

    public Circle() {
        System.out.println("Circle created!!!");
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle!!!");
    }
}
