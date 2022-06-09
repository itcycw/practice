package com.awei.test.gupao.spring.base.initbean;

import com.awei.test.gupao.spring.domain.Student;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author cw
 */
public class MyImportConfig2 implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean hasCourse = registry.containsBeanDefinition("Course");
        if (hasCourse) {
            registry.registerBeanDefinition("Student", new RootBeanDefinition(Student.class));
        }
    }
}
