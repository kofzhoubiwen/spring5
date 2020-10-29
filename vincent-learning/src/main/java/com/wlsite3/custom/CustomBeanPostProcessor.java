package com.wlsite3.custom;

import com.wlsite.util.LogUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase("gameServiceImpl")){
            LogUtil.info("postProcessBeforeInitialization", this);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase("gameServiceImpl")) {
            LogUtil.info("postProcessBeforeInitialization", this);
        }
        return bean;
    }
}
