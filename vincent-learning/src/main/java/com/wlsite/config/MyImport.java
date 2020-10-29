package com.wlsite.config;

import com.wlsite2.WikiService;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImport implements ImportSelector {
    @Override
    // 获取配置类的名称 自动找到类 然后把类放入容器里面 进而帮助我们创建出对象
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{WikiService.class.getName()};
    }
}
