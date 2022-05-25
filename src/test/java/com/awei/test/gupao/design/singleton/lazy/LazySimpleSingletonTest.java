package com.awei.test.gupao.design.singleton.lazy;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月25日 23:26:00
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread thread = new Thread(new ExcetorThread());
        Thread thread2 = new Thread(new ExcetorThread());
        thread.start();
        thread2.start();
    }

}
