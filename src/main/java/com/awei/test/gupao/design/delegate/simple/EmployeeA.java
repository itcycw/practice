package com.awei.test.gupao.design.delegate.simple;

public class EmployeeA implements Iemployee{
        protected  String gooodAt = "画画";
    @Override
    public void doing(String task){
        System.out.println("我是员工a,我擅长做"+gooodAt+"现在开始做"+task);
    }
}
