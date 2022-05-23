package com.awei.test.gupao.design.factory.abstactfactory;

/**
 * @author Cw
 * @version 1.0.0
 * @Description 一个品牌的抽象; 要求所有的子工厂都实现这个工厂
 * @createTime 2022年05月24日 00:37:00
 */
public class ICarFactoryTest {

    public static void main(String[] args) {
        IPhoneFactory factory = new IPhoneFactory();
        factory.createCar().drive();
        factory.createIphone().call();
        factory.createIpad().painting();

        System.out.printf("\n=================================\n");

        IPadFactory iPadFactory = new IPadFactory();
        iPadFactory.createCar().drive();
        iPadFactory.createIphone().call();
        iPadFactory.createIpad().painting();
    }

}
