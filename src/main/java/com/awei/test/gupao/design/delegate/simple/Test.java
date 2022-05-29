package com.awei.test.gupao.design.delegate.simple;

public class Test {

    public static void main(String[] args) {
       new  Boss().command("编程",new Leader());
       new  Boss().command("作图",new Leader());
       new  Boss().command("1",new Leader());
    }
}
