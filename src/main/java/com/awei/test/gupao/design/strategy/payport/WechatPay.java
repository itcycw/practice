package com.awei.test.gupao.design.strategy.payport;

import com.awei.test.gupao.design.strategy.pay.Payment;

public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double checkBalance(String uid) {
        return 60;
    }
}
