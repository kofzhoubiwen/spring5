package com.itheima.spring;

import com.itheima.spring.config.HmConfig;
import com.itheima.spring.service.UserService;
import com.itheima.spring.test.X;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：sean
 * @date ：Created in 2020/6/19
 * @description ：
 * @version: 1.0
 */
public class SpringApp {
	public static void main(String args[]) throws Exception{
		// 基于Java配置 初始化应用上下文
		AnnotationConfigApplicationContext ac
				= new AnnotationConfigApplicationContext(HmConfig.class);
		//UserService userService = ac.getBean(UserService.class);
		//userService.findUserList();
		X x = (X)ac.getBean("x");
		System.out.println(x);
		x.print();

	}
}
