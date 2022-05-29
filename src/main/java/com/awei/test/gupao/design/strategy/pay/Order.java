package com.awei.test.gupao.design.strategy.pay;

public class Order {
    private String id;
    private String orderNum;
    private double amount;

    public Order(String id, String orderNum, double amount) {
        this.id = id;
        this.orderNum = orderNum;
        this.amount = amount;
    }

    public MesResult pay(String payKey ){

        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用"+payment.getName());
       return payment.pay(orderNum, amount);
    }
    public MesResult pay(){
        return pay(null);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
