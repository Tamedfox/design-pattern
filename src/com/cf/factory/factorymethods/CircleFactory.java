package com.cf.factory.factorymethods;

import com.cf.factory.Circle;
import com.cf.factory.Factory;
import com.cf.factory.Shape;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/4 16:33
 */
public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
