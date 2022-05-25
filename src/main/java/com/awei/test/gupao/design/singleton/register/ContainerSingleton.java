package com.awei.test.gupao.design.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Cw
 * @version 1.0.0
 * @Description 注册式单例--容器单例
 * @createTime 2022年05月26日 00:42:00
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        if (!ioc.containsKey(className)) {
            Object instance = null;
            try {
                instance = Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ioc.put(className, instance);
            return instance;
        } else {
            return ioc.get(className);
        }
    }
    
}
