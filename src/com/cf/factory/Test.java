package com.cf.factory;

import com.cf.factory.factorymethods.CircleFactory;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/4 16:15
 */
public class Test {

    public static void main(String[] args) {
        /*
         * 简单工厂,新增产品类需要修改SimpleFactory.getShape方法，不符合开闭原则
         */
//        System.out.println("简单工厂模式开始！！！");
//        Shape circle = SimpleFactory.getShape("CIRCLE");
//        circle.draw();
//
//        Shape rectangle = SimpleFactory.getShape("RECTANGLE");
//        rectangle.draw();
//
//        Shape square = SimpleFactory.getShape("SQUARE");
//        square.draw();
//        System.out.println("简单工厂模式结束！！！");

        /*
         * 简单工厂反射运用，解耦
         */
//        System.out.println("简单工厂模式--反射，开始！！！");
//        Circle circle = (Circle) SimpleFactoryInvoke.getClass(Circle.class);
//        circle.draw();
//        System.out.println("简单工厂模式--反射，结束！！！");

        /*
         *  工厂方法
         */
        System.out.println("工厂方法开始！！！");
        Factory factory = new CircleFactory();
        Shape shape = factory.getShape();
        shape.draw();
        System.out.println("工厂方法结束！！！");
    }


}
