package com.awei.test.gupao.design.singleton.hungry;

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
public class HungrySingleton {

    /**
     * 类加载的时候就创建好对象
     */
    private static final HungrySingleton insistence = new HungrySingleton();

    /**
     * 构造方法私有化
     */
    private HungrySingleton() {
    }

    /**
     * 对外提供一个获取实例的入口
     */
    public static HungrySingleton getInsistence() {
        return insistence;
    }

}
