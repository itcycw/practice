package com.awei.test.gupao.design.factory.simpleFactory;

import com.awei.test.gupao.design.factory.domain.Car;
import com.awei.test.gupao.design.factory.domain.Motorcycle;
import com.awei.test.gupao.design.factory.domain.Suv;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月23日 23:57:00
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        try {
            Car newCar = simpleFactory.createNewCar(Motorcycle.class);
            System.out.println("newCar = " + newCar);
            newCar.drive();

            System.out.println("========================================");

            Car car = simpleFactory.createNewCar(Suv.class);
            System.out.println("car = " + car);
            car.drive();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}
