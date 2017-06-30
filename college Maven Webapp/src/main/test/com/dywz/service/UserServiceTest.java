package com.dywz.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.dywz.common.entity.User;

/**
 * 
* @Author Kyrie Irving
* @Title: UserServiceTest 
* @Description: UserService的junit测试方法
* @Date 2017年6月30日 下午12:08:00
 */
public class UserServiceTest {
    UserService userService =new UserService();
     
	@Test
	public void testAddUser() {
		User user = new User();
		user.setId("7b267760-58b7-4ac3-8b13-6b03b25550d1");
		user.setUserName("Mcshunlei");
		user.setUserPassword("12345");
		user.setUserType("0");
		
		userService.addUser(user);
		
		
	}

	@Test
	public void testSelectOneUser() {
		String userName = "Mcshunlei";
		String userPassword ="12345";
		User list = userService.selectOneUser(userName, userPassword);
		System.out.println(list.getUserType());
	}
    @Ignore
	@Test
	public void testSelectUser() {
		List<User> list = userService.selectUser();
		for(int i=0;i>list.size();i++){
			System.out.println(list.get(i).getUserType());
		}
		
	}

}
