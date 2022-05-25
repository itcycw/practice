package com.awei.test.gupao.design.singleton.register;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 00:51:00
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
        Object instance = ContainerSingleton.getInstance("com.awei.test.gupao.design.singleton.register.Pojo");
        System.out.println("instance1 = " + instance);

        Object instance2 = ContainerSingleton.getInstance("com.awei.test.gupao.design.singleton.register.Pojo");
        System.out.println("instance2 = " + instance2);
    }
    

}
