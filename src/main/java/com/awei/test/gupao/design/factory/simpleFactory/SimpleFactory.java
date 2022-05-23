package com.awei.test.gupao.design.factory.simpleFactory;

import com.awei.test.gupao.design.factory.domain.Car;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月23日 23:56:00
 */
public class SimpleFactory {


    public Car createNewCar(Class clazz) throws IllegalAccessException, InstantiationException {
        Car o;
        if (null == clazz) {
            return null;
        } else {
            o = (Car) clazz.newInstance();
        }
        return o;
    }

}
