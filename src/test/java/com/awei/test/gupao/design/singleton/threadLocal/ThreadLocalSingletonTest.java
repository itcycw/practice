package com.awei.test.gupao.design.singleton.threadLocal;

import com.awei.test.gupao.design.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 01:20:00
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        ThreadLocalSingleton instance1 = ThreadLocalSingleton.getInstance();
        System.out.println("instance1 = " + instance1);

        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        System.out.println("instance2 = " + instance2);

        //线程内单例，不同线程不保证
        Thread thread = new Thread(new ExcetorThread());
        Thread thread2 = new Thread(new ExcetorThread());
        thread.start();
        thread2.start();
    }

}
