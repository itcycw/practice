package com.awei.test.gupao.spring.base.initbean;

import com.awei.test.gupao.spring.domain.Student;
import com.awei.test.gupao.spring.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author cw
 */
@Configuration
@Import({Student.class, MyImportConfig2.class})
public class MyConfig {
    /**
     * 给IOC容器注册Bean的方式
     * 1、@Bean 直接导入单个类
     * 2、@ComponenScan扫描（默认扫描@Controlloa,@Server,@Component）
     * 3.@Import 快速给容器导入Bean的方式
     * a.@Import 直接参数导入
     * b.实现ImportSelector 自定义规则实现
     * c.实现ImportBeanDefinitionRegistrar,获得BeanDefinitionRegistry可以手动导入
     * 4、FactoryBean 把需要注册的对象封装成FactoryBean
     * a. FactoryBean 负责将Bean注册到Ioc的Bean
     * b. BeanFactory 从Ioc容器中获得Bean对象
     */

    @Bean(name = "user")
    public User User() {
        return new User("1", "cq", "1235456789", "18");
    }

    @Bean
    public MyFactoryBean MyFactoryBean() {
        return  new MyFactoryBean();
    }
}
