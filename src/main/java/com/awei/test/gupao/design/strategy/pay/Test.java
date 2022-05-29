package com.awei.test.gupao.design.strategy.pay;

public class Test {

    public static void main(String[] args) {
        Order order = new Order("111","20141414",200);
        MesResult result = order.pay("WechatPay");
        System.out.println(result);
    }
}
