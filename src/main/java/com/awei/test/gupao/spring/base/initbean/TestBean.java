package com.awei.test.gupao.spring.base.initbean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author cw
 */
public class TestBean {

    @Test
    public void testBean() {
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(s -> System.out.println(s));

        //获取的是MyFactoryBean包装的类信息
        System.out.println("MyFactoryBean1: "+app.getBean("MyFactoryBean"));

        //需要拿到factoryBean自身的bean信息 需要在beanName前拼接一个 & 符号
        System.out.println("MyFactoryBean2: "+app.getBean("&MyFactoryBean"));

    }
}
