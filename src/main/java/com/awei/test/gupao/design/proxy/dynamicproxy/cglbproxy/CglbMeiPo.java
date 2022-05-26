package com.awei.test.gupao.design.proxy.dynamicproxy.cglbproxy;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @author Cw
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月26日 23:07:00
 */
public class CglbMeiPo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    private void before() {
        System.out.println("前置处理");
    }

    private void after() {
        System.out.println("后置处理");
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object aSuper = methodProxy.invokeSuper(o, objects);
        after();
        return aSuper;
    }
}
