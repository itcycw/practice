package com.awei.test.gupao.design.singleton.lazy;

/**
 * @author Cw
 * @version 1.0.0
 * @Description 懒汉式单例, 双重检查 doubleCheck
 * <p>
 * 优点：性能高了。线程安全了
 * <p>
 * 缺点： 代码理解困难，不够优雅
 * @createTime 2022年05月25日 23:23:00
 */
public class LazyDoubleCheckSingleton {

    /**
     * volatile 关键字解决指令重排序的问题
     */
    private static volatile LazyDoubleCheckSingleton insistence;

    /**
     * 构造方法私有化
     */
    private LazyDoubleCheckSingleton() {
    }

    /**
     * 对外提供一个获取实例的入口
     */
    public static LazyDoubleCheckSingleton getInsistence() {
        //第一次判断目的是是否需要加锁（尽量减小锁的颗粒度）
        if (null == insistence) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //第二次判断目的是判断是否已经有对象生成了
                if (null == insistence) {
                    // insistence = new LazyDoubleCheckSingleton() 这里存在指令重排序的问题
                    // 处理方式：volatile关键字
                    insistence = new LazyDoubleCheckSingleton();
                }
            }

        }

        return insistence;
    }


}
