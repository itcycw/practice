package com.awei.test.gupao.design.factory.domain;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月24日 00:00:00
 */
public class Motorcycle implements Car {

    @Override
    public void drive() {
        System.out.println("摩托车行驶！！！");
    }
}
