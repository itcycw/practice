package com.awei.test.gupao.design.strategy;

public class Test {
    public static void main(String[] args) {
        String promotion = "返现";
        PromotionActivity p =  new PromotionActivity(new EmptyStrategy());
        if("团购".equals(promotion)){
            p = new PromotionActivity(new GroupbuyStrategy());
        }else   if("返现".equals(promotion)){
            p = new PromotionActivity(new CashbackStrategy());
        }

        p.execute();
    }
}
