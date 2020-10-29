package com.wlsite3.custom;

import com.wlsite.util.LogUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase("gameServiceImpl")){
            LogUtil.info("postProcessBeforeInstantiation", this);
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase("gameServiceImpl")){
            LogUtil.info("postProcessAfterInstantiation", this);
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if(beanName.equalsIgnoreCase("gameServiceImpl")){
            LogUtil.info("postProcessProperties", this);
        }
        return pvs;
    }
}
