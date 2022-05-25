package com.awei.test.gupao.design.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 00:08:00
 */
public class LazySimpleStaticInnerClassSingletonTest {

    public static void main(String[] args) {
        LazySimpleStaticInnerClassSingleton instance = LazySimpleStaticInnerClassSingleton.getInstance();
        System.out.println("instance1 = " + instance);
        LazySimpleStaticInnerClassSingleton instance2 = LazySimpleStaticInnerClassSingleton.getInstance();
        System.out.println("instance2 = " + instance2);

//     -------------------------------------------------------------------------------------------------------

        //利用反射破坏单例
        try {
            Constructor<?> constructor = LazySimpleStaticInnerClassSingleton.class
                .getDeclaredConstructor(null);
            //打印构造方法
//            System.out.println("constructor = " + constructor);
            constructor.setAccessible(true);
            Object instance3 = constructor.newInstance();
            System.out.println("instance3 = " + instance3);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
