package com.awei.test.gupao.design.factory.abstactfactory;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月24日 00:34:00
 */
public class JavaPhone implements IPhone {

    @Override
    public void call() {
        System.out.println("用iphone拨打电话...");
    }
}
