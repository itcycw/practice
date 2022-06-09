package com.awei.test.gupao.spring.base.initbean;

import org.springframework.context.annotation.ImportSelector;

public class ImportConfig implements ImportSelector {
    @Override
    public String[] selectImports(org.springframework.core.type.AnnotationMetadata importingClassMetadata) {

        return new String[0];
    }
}
