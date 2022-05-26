package com.awei.test.gupao.design.proxy.dynamicproxy.cglbproxy;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 23:31:00
 */
public class Test {

    public static void main(String[] args) {
        CglbMeiPo cglbMeiPo = new CglbMeiPo();
        ZhangSan zhangSan = (ZhangSan) cglbMeiPo.getInstance(ZhangSan.class);
        zhangSan.findGirlFriend();
        System.out.println("-----------------------------------");
        zhangSan.study();

        System.out.println("-----------------------------------");

        LiSi liSi = (LiSi) cglbMeiPo.getInstance(LiSi.class);
        liSi.findGirlFriend();
        System.out.println("-----------------------------------");
        liSi.study();

    }

}
