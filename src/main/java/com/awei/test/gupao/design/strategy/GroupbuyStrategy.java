package com.awei.test.gupao.design.strategy;

public class GroupbuyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("团购优惠");
    }
}
