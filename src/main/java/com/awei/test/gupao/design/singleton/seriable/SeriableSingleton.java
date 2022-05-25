package com.awei.test.gupao.design.singleton.seriable;

import java.io.Serializable;

/**
 * @author Cw
 * @version 1.0.0
 * @Description 饿汉式单例
 * <p>
 * 优点：执行效率高，性能高，线程安全
 * <p>
 * 缺点：当单例过多时会造成内存浪费
 * @createTime 2022年05月25日 22:58:00
 */
public class SeriableSingleton implements Serializable {

    private static final long serialVersionUID = -3130115967678740593L;

    /**
     * 类加载的时候就创建好对象
     */
    private static final SeriableSingleton insistence = new SeriableSingleton();

    /**
     * 构造方法私有化
     */
    private SeriableSingleton() {
    }

    /**
     * 对外提供一个获取实例的入口
     */
    public static SeriableSingleton getInsistence() {
        return insistence;
    }

    /**
     * 该方法可以防止单例被序列化-反序列化破坏（ 桥接模式）
     * <p>
     * 反序列化的时候源码里面会判断是否有该方法，有就不会去新建一个对象，否则就新建一个对象导致单例被破坏
     */
    private Object readResolve() {
        return insistence;
    }

}
