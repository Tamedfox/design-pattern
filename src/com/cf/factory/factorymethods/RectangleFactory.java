package com.cf.factory.factorymethods;

import com.cf.factory.Factory;
import com.cf.factory.Rectangle;
import com.cf.factory.Shape;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/4 16:34
 */
public class RectangleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
