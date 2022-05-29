package com.awei.test.gupao.design.strategy;

public class CashbackStrategy  implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现优惠");
    }
}
