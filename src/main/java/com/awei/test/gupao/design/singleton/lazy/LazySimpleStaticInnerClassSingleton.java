package com.awei.test.gupao.design.singleton.lazy;

/**
 * @author Cw
 * @version 1.0.0
 * @Description 静态内部类
 * <p>
 * 优点：利用java的类加载机制实现延迟加载（懒汉式） 写法优雅，性能高避免了内存浪费
 * <p> 补充：内部类只有在被使用的时候才会去加载和初始化
 * <p>
 * 缺点： 能够被反射破坏
 * @createTime 2022年05月26日 00:03:00
 */
public class LazySimpleStaticInnerClassSingleton {

    private LazySimpleStaticInnerClassSingleton() {
        if (null != LazyHolder.instance) {
            throw new RuntimeException("非法操作!");
        }
    }

    public static LazySimpleStaticInnerClassSingleton getInstance() {
        return LazyHolder.instance;
    }

    private static class LazyHolder {

        private static final LazySimpleStaticInnerClassSingleton instance = new LazySimpleStaticInnerClassSingleton();
    }


}
