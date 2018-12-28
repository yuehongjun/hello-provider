package com.myPj.Spring_Mybatis;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.model.User;
import com.test.service.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class Test {

	@Autowired
	private UserService userService;

	@org.junit.Test
	public void test1() {

		User user = userService.getUserByUsername("aaa");
		if(user !=null){
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
		}else{
			System.out.println("不存在！！");
		}
		

	}

	@org.junit.Test
	public void test2() {

		userService.saveUser("test886", "9999999");

	}

}