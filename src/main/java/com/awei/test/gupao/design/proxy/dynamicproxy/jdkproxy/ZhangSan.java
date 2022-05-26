package com.awei.test.gupao.design.proxy.dynamicproxy.jdkproxy;


/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 22:53:00
 */
public class ZhangSan implements IPerson {

    @Override
    public void findGirlFriend() {
        System.out.println("肤白貌美大长腿");
    }

    @Override
    public void study() {
        System.out.println("ZhangSan 喜欢学数学");
    }
}
