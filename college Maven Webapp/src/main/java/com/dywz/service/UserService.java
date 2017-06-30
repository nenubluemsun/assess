package com.dywz.service;

import java.util.ArrayList;
import java.util.List;

import com.dywz.common.core.ServiceExtends;
import com.dywz.common.entity.User;

/**
 * 
 * @author 我要睡觉了
 * @Title UserService.java
 * @Description TODO
 * @time 2017年6月26日 上午1:50:28
 */
public class UserService extends ServiceExtends {

	
	
	public void addUser(User user) {
		userDao.addUser(user);
	}
	
	
	public void deleteUser(String id, String value) {
		userDao.deleteUser(id, value);
	}
	
	
	public User selectOneUser(String userName, String userPassword) {
		User user = new User();
		user = userDao.selectOneUser(userName, userPassword);
		return user;
	}
	
	
	public List<User> selectUser() {
		List<User> list = new ArrayList<User>();
		list = userDao.selectUser();
		return list;
	}
	
	
	
	
	
	
}
