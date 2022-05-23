package com.awei.test.gupao.design.factory.factorymethod;

import com.awei.test.gupao.design.factory.domain.Car;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月24日 00:22:00
 */
public class CarFactoryTest {

    public static void main(String[] args) {
        MotorcycleFactory factory = new MotorcycleFactory();
        Car car = factory.car();
        car.drive();

        System.out.printf("\n==================================\n");

        SuvFactory suvFactory = new SuvFactory();
        Car c = suvFactory.car();
        c.drive();
    }

}
