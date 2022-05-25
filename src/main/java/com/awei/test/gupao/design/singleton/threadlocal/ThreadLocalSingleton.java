package com.awei.test.gupao.design.singleton.threadlocal;

/**
 * @author Cw
 * @version 1.0.0
 * @Description ThreadLocal单例 保证线程内部的全局唯一，且天生线程安全
 * <p>
 * @createTime 2022年05月26日 01:12:00
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {
    }


    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }

}
