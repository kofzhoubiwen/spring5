package com.itheima.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：seanyang
 * @date ：Created in 2020/7/7
 * @description ：
 * @version: 1.0
 */
@Component
public class Y {
	@Autowired
	private X x;
	public Y(){
		System.out.println("create Y....");
	}
	public void print(){
		System.out.println("print y...");
	}
}
