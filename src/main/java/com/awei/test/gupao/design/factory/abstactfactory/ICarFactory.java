package com.awei.test.gupao.design.factory.abstactfactory;

import com.awei.test.gupao.design.factory.domain.Car;

/**
 * @author Cw
 * @version 1.0.0
 * @Description 产品族
 * @createTime 2022年05月24日 00:28:00
 */
public interface ICarFactory {

    Car createCar();

    IPhone createIphone();

    IPad createIpad();

}
