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
public class X {
	@Autowired
	private Y y;
	public X(){
		System.out.println("create X()...");
	}
	public void print(){
		y.print();
		System.out.println("print x....");
	}
}
