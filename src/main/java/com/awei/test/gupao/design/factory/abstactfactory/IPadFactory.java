package com.awei.test.gupao.design.factory.abstactfactory;

import com.awei.test.gupao.design.factory.domain.Car;
import com.awei.test.gupao.design.factory.domain.Suv;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月24日 00:31:00
 */
public class IPadFactory implements ICarFactory {

    @Override
    public Car createCar() {
        return new Suv();
    }

    @Override
    public IPhone createIphone() {
        return new JavaPhone();
    }

    @Override
    public IPad createIpad() {
        return new JavaPad();
    }

}
