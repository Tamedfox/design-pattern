package com.cf.factory.simple;

import com.cf.factory.Shape;

/**
 * @author cf
 * @version 1.0
 * @date 2020/5/4 16:26
 */
public class SimpleFactoryInvoke {

    public static Object getClass(Class<? extends Shape> clazz){
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }

}
