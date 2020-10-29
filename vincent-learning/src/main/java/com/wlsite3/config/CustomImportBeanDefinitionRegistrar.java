package com.wlsite3.config;

import com.wlsite.config.MyFactoryBean;
import com.wlsite.dao.OrderDao;
import com.wlsite3.service.IServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class CustomImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) BeanDefinitionBuilder
                .genericBeanDefinition(IServiceImpl.class)
                .setLazyInit(false)
                .setScope("singleton")
                .setAbstract(false)
                .getBeanDefinition();
        registry.registerBeanDefinition("IServiceImpl", beanDefinition);
    }
}
