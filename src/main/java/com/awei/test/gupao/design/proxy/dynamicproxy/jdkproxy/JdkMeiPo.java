package com.awei.test.gupao.design.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 23:07:00
 */
public class JdkMeiPo implements InvocationHandler {

    private IPerson target;

    public IPerson getProxy(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        Object proxyInstance = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        return (IPerson) proxyInstance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("前置处理");
    }

    private void after() {
        System.out.println("后置处理");
    }


}
