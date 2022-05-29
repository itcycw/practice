package com.awei.test.gupao.design.strategy.payport;

import com.awei.test.gupao.design.strategy.pay.Payment;

public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double checkBalance(String uid) {
        return 200;
    }
}
