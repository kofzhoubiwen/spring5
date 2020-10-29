package com.wlsite.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        AnnotatedBeanDefinition annotatedBeanDefinition =
                (AnnotatedBeanDefinition) beanFactory.getBeanDefinition("userDaoImplHello");
        annotatedBeanDefinition.setScope("prototype");
    }
}
