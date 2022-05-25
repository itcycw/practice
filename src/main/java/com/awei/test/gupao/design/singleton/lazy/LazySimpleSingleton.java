package com.awei.test.gupao.design.singleton.lazy;

/**
 * @author Cw
 * @version 1.0.0
 * @Description 懒汉式单例
 * <p>
 * 优点：节约了内存，使用的时候才去初始化
 * <p>
 * 缺点： 存在线程安全问题
 * @createTime 2022年05月25日 22:58:00
 */
public class LazySimpleSingleton {


    private static LazySimpleSingleton insistence;

    /**
     * 构造方法私有化
     */
    private LazySimpleSingleton() {
    }

    /**
     * 对外提供一个获取实例的入口
     */
    public static LazySimpleSingleton getInsistence() {
        if (null == insistence) {
            insistence = new LazySimpleSingleton();
        }

        return insistence;
    }

}
