package com.awei.test.gupao.design.proxy.dynamicproxy.jdkproxy;


/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 22:53:00
 */
public class LiSi implements IPerson {

    @Override
    public void findGirlFriend() {
        System.out.println("有车有房学历高");
    }

    @Override
    public void study() {
        System.out.println("LiSi 喜欢学英语");
    }
}
