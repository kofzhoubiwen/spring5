package com.wlsite.test;

import com.wlsite.config.SpringConfig;
import com.wlsite.service.IndexService;
import com.wlsite.service.IndexServiceImpl;
import com.wlsite.service.RoomService;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.PropertyDescriptor;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestFactoryMethod {


    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        RoomService roomService = (RoomService) context.getBean("roomService");
        roomService.query();

    }
}

