package com.awei.test.gupao.design.strategy.payport;

import com.awei.test.gupao.design.strategy.pay.Payment;

public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东";
    }

    @Override
    protected double checkBalance(String uid) {
        return 100;
    }
}
