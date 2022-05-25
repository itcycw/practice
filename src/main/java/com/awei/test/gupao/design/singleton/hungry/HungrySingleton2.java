package com.awei.test.gupao.design.singleton.hungry;

/**
 * @author Cw
 * @version 1.0.0
 * @Description 饿汉式单例
 * <p>
 * 优点：性能高，线程安全
 * <p>
 * 缺点：当单例过多时会造成内存浪费
 * @createTime 2022年05月25日 22:58:00
 */
public class HungrySingleton2 {

    private final static HungrySingleton2 insistence;

    /**
     * 利用静态代码块来出创建对象，实际上和第一种没啥区别
     */
    static {
        insistence = new HungrySingleton2();
    }

    /**
     * 构造方法私有化
     */
    private HungrySingleton2() {
    }

    /**
     * 对外提供一个获取实例的入口
     */
    public static HungrySingleton2 getInsistence() {
        return insistence;
    }

}
