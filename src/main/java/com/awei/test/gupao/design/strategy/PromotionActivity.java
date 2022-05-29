package com.awei.test.gupao.design.strategy;

public class PromotionActivity {
    private IPromotionStrategy promotionStrategy;

    public PromotionActivity(IPromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }
}
