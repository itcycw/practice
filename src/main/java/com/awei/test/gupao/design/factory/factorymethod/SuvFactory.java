package com.awei.test.gupao.design.factory.factorymethod;

import com.awei.test.gupao.design.factory.domain.Car;
import com.awei.test.gupao.design.factory.domain.Suv;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月24日 00:20:00
 */
public class SuvFactory implements CarFactory {

    @Override
    public Car car() {
        return new Suv();
    }
}
