package com.wlsite.config;

import com.wlsite.util.LogUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class TestBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("userDaoImpl")) {
            LogUtil.info("postProcessBeforeInitialization@TestBeanPostProcessor", this);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("userDaoImpl")) {
            LogUtil.info("postProcessAfterInitialization@TestBeanPostProcessor", this);
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
