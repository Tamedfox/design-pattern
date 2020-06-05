package com.cf.factory;

/**
 * 长方形
 * @author cf
 * @version 1.0
 * @date 2020/5/4 16:11
 */
public class Rectangle implements Shape {

    public Rectangle() {
        System.out.println("Rectangle created!!!");
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle!!!");
    }
}
