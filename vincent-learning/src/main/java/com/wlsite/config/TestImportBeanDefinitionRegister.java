package com.wlsite.config;

import com.wlsite.dao.OrderDao;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;


public class TestImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 此处可以遍历某个包下面的所有接口文件
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) BeanDefinitionBuilder
                .genericBeanDefinition(OrderDao.class) // 定义代理类型
                .setLazyInit(false)
                .setScope("singleton")
                .setAbstract(false)
                .getBeanDefinition();
        // 到此处 如果直接注册的话 会报错 因为OrderDao是一个接口 所以需要将beanClass设置成FactoryBean
        // BeanClass需要提供包含该属性的构造方法，否则会注入失败
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClassName());
        // !! 将类型设置成FactoryBean 通过FactoryBean拿到代理对象
        beanDefinition.setBeanClass(MyFactoryBean.class);
        registry.registerBeanDefinition("实现接口ImportBeanDefinitionRegistrar而添加的BD", beanDefinition);
    }

}
