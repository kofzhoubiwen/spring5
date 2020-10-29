package com.wlsite.aop;

import com.wlsite.config.TestBeanFactoryPostProcessor2;
import com.wlsite.util.LogUtil;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        // 将自定义工厂后置处理器添加到应用上下文中
        applicationContext.addBeanFactoryPostProcessor(new TestBeanFactoryPostProcessor2());
        LogUtil.info("获取Spring上下文并进行自定义修改 如添加工厂后置处理器等.", this);
    }
}
