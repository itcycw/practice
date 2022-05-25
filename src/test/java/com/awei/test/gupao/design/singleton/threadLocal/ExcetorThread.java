package com.awei.test.gupao.design.singleton.threadLocal;

import com.awei.test.gupao.design.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月25日 23:27:00
 */
public class ExcetorThread implements Runnable {

    @Override
    public void run() {
        ThreadLocalSingleton insistence1 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " 线程:insistence1 = " + insistence1);
        ThreadLocalSingleton insistence2 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " 线程:insistence2 = " + insistence2);
    }
}
