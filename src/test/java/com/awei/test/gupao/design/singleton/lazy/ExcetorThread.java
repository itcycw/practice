package com.awei.test.gupao.design.singleton.lazy;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月25日 23:27:00
 */
public class ExcetorThread implements Runnable {

    @Override
    public void run() {
        LazyDoubleCheckSingleton insistence = LazyDoubleCheckSingleton.getInsistence();
        System.out.println("insistence = " + insistence);

//        LazySimpleSingleton insistence2 = LazySimpleSingleton.getInsistence();
//        System.out.println("insistence2 = " + insistence2);
    }
}
