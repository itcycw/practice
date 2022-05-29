package com.awei.test.gupao.design.strategy;

public class EmptyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("没有优惠");
    }
}
