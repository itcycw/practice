package com.awei.test.gupao.design.proxy.staticproxy;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 22:53:00
 */
public class ZhangLaoHan implements IPerson {

    private ZhangSan zhangSan;

    public ZhangLaoHan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void findGirlFriend() {
        System.out.println("开始替儿子找对象");
        zhangSan.findGirlFriend();
        System.out.println("找到了");
    }
}
