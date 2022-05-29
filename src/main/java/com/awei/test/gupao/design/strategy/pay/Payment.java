package com.awei.test.gupao.design.strategy.pay;

public abstract class Payment {

    public  abstract String getName();

    public MesResult pay(String uid,double amout){
        if(checkBalance(uid) < amout){
            return new MesResult("500","支付失败","余额不足");
        }else {
            return new MesResult("200","支付金额:"+amout,"支付成功");
        }
    }

    protected abstract double checkBalance(String uid) ;
}
