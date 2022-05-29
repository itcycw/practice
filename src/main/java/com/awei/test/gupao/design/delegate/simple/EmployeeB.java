package com.awei.test.gupao.design.delegate.simple;

public class EmployeeB implements Iemployee{
    protected  String gooodAt = "编程";
    @Override
    public void doing(String task) {
        System.out.println("我是员工b,我擅长做" + gooodAt + "现在开始做"+task);
    }
}
