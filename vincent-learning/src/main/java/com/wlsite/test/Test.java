package com.wlsite.test;
import com.wlsite.config.SpringConfig;
import com.wlsite.service.IndexService;

import com.wlsite.service.IndexServiceImpl;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.PropertyDescriptor;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Test {


    public static void main(String[] args) {


        Log log = LogFactory.getLog("spring-jcl");
        // 准备好spring的环境
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerBean("bbb", IndexService.class, IndexServiceImpl::new);
        context.register(SpringConfig.class);
//        context.scan("com.wlsite2");
//        context.addBeanFactoryPostProcessor(new TestBeanFactoryPostProcessor2()); // 添加自定义工厂后置处理器
//        context.addBeanFactoryPostProcessor(new TestBeanDefinitionRegistryPostProcessor2()); // 添加自定义工厂后置处理器
        context.refresh();
//        UserDao userDao = (UserDao)context.getBean("userDaoImplHello");
//        userDao.query();
        IndexService indexService = (IndexService)context.getBean("aaa");
//        indexService.service();
        indexService.orderTest();

        PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(indexService);


        new ArrayBlockingQueue<>(2000);
        new LinkedBlockingDeque<>();


    }
}

