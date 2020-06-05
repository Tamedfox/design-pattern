package com.cf.factory.simple;

import com.cf.factory.Circle;
import com.cf.factory.Rectangle;
import com.cf.factory.Shape;
import com.cf.factory.Square;

/**
 * 简单工厂
 * @author cf
 * @version 1.0
 * @date 2020/5/4 16:13
 */
public class SimpleFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
