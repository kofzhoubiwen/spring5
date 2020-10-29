package com.wlsite.config;

import com.alibaba.fastjson.JSON;
import com.wlsite.dao.UserDaoImpl;
import com.wlsite.util.LogUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class TestBeanDefinitionRegistryPostProcessor2 implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        RootBeanDefinition helloBean = new RootBeanDefinition(UserDaoImpl.class);
        registry.registerBeanDefinition("实现接口BeanDefinitionRegistryPostProcessor而添加的BD", helloBean);

        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        LogUtil.info("检测到如下beanDefinitionNames: "+ JSON.toJSONString(beanDefinitionNames), this);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    }
}
