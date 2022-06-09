package com.awei.test.gupao.spring.base.initbean;

import com.awei.test.gupao.spring.domain.Crouse;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean  implements FactoryBean<Crouse> {
    @Override
    public Crouse getObject() throws Exception {
        return new Crouse();
    }

    @Override
    public Class<?> getObjectType() {
        return Crouse.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
