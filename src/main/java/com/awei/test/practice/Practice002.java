package com.awei.test.practice;

import java.util.ArrayList;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年04月21日 22:24:00
 */
public class Practice002 {

    public static void main(String[] args) {
        int sum = add(10, 3);
        System.out.println("sum = " + sum);
    }

    public static int add(int a, int b) {
        //执行一个方法时：会在栈里面新建一个栈帧，栈的内存是固定的，如果使用不当(如下)就会造成栈内存溢出：StackOverflowError
        //一个方法没执行完，又调用一个方法，以此类推
//        add();

        ArrayList<Object> arrayList = new ArrayList<>();

        return a + b;
    }

}
