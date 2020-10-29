package com.itheima.spring.service;

import com.itheima.spring.pojo.User;

import java.util.List;

/**
 * @author ：sean
 * @date ：Created in 2020/6/19
 * @description ：用户业务
 * @version: 1.0
 */
public interface UserService {
	List<User> findUserList();
	public User findUserByUsername(String username);
}
