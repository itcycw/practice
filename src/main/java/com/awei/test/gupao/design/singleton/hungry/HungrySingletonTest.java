package com.awei.test.gupao.design.singleton.hungry;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月25日 23:03:00
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton insistence = HungrySingleton.getInsistence();
        System.out.println("insistence = " + insistence);
        HungrySingleton insistence2 = HungrySingleton.getInsistence();
        System.out.println("insistence2 = " + insistence2);
    }

}
