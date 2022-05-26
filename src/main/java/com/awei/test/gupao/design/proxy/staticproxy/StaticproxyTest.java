package com.awei.test.gupao.design.proxy.staticproxy;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 22:55:00
 */
public class StaticproxyTest {

    public static void main(String[] args) {
        IPerson person = new ZhangLaoHan(new ZhangSan());
        person.findGirlFriend();
    }

}
