package com.awei.test.gupao.design.singleton.lazy;

import java.lang.reflect.Constructor;

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

        //利用反射破坏单例
        try {
            Constructor<?> constructor = LazyDoubleCheckSingleton.class
                .getDeclaredConstructor(null);
            //打印构造方法
//            System.out.println("constructor = " + constructor);
            constructor.setAccessible(true);
            Object insistence3 = constructor.newInstance();
            System.out.println("insistence3 = " + insistence3);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
