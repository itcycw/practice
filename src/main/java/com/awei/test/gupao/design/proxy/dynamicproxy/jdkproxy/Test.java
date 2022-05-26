package com.awei.test.gupao.design.proxy.dynamicproxy.jdkproxy;


/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 23:13:00
 */
public class Test {

    public static void main(String[] args) {
        JdkMeiPo jdkMeiPo = new JdkMeiPo();
        IPerson proxy = jdkMeiPo.getProxy(new ZhangSan());
        proxy.findGirlFriend();
        System.out.println("------------------------------------------");
        proxy.study();
        System.out.println("------------------------------------------");
        IPerson proxy2 = jdkMeiPo.getProxy(new LiSi());
        proxy2.findGirlFriend();
        System.out.println("------------------------------------------");
        proxy2.study();

    }

}
