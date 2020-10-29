package com.itheima.spring.service.impl;

import com.itheima.spring.pojo.User;
import com.itheima.spring.service.QuestionService;
import com.itheima.spring.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author ：seanyang
 * @date ：Created in 2020/6/19
 * @description ：
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService, ApplicationContextAware,InitializingBean {

	@Autowired
	private QuestionService questionService;
	private ApplicationContext applicationContext;


	public UserServiceImpl(){
		System.out.println("UserServiceImpl 无参构造方法...");
	}
	@Override
	public List<User> findUserList() {
		System.out.println("findUserList...");
		return null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("生命周期回调 通过InitializingBean...afterPropertiesSet...");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("applicationContext. 传入applicationContext");
	}

	@PostConstruct
	public void initUserService(){
		System.out.println("生命周期回调：通过注解回调initUserService......");
	}

	@Override
	public User findUserByUsername(String username) {
		System.out.println("findUserByUsername");
		return null;
	}
}
