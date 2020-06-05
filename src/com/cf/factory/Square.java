package com.cf.factory;

/**
 * 正方形
 * @author cf
 * @version 1.0
 * @date 2020/5/4 16:12
 */
public class Square implements Shape{

    public Square() {
        System.out.println("Square created!!!");
    }

    @Override
    public void draw() {
        System.out.println("Draw Square!!!");
    }
}


