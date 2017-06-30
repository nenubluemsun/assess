package com.dywz.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dywz.common.core.AbstractDao;
import com.dywz.common.core.ExpandBeanHandler;
import com.dywz.common.core.ExpandBeanListHandler;
import com.dywz.common.entity.User;

public class UserDao extends AbstractDao {

	
	/**
	 * 
	 * @Title: addUser
	 * @Description: 添加用户
	 * @return: void
	 */
	public void addUser(User user) {
		String userName = user.getUserName();
		String userPassword = user.getUserPassword();
		String userType = user.getUserType();
		String sql = "INSERT INTO user (user_name, user_password, user_type) VALUES (?, ?, ?)";
		Object[] params = {userName, userPassword, userType};
		try {
			insert(sql, params);
		} catch (SQLException e) {
			System.out.println("添加用户失败");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * @Title: deleteUser
	 * @Description: 更改一个用户的显示状态
	 * @return: void
	 */
	public void deleteUser(String id, String value) {
		String sql = "UPDATE user SET user_is_delete = ? WHERE id = ?";
		Object[] params = {value, id};
		try {
			update(sql, params);
		} catch (SQLException e) {
			System.out.println("更改显示状态失败");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * @Title: selectOneUser
	 * @Description: 查询登录
	 * @return: User
	 */
	public User selectOneUser(String userName, String userPassword) {
		String sql = "SELECT id, user_name, user_password, user_type, user_is_delete FROM user WHERE user_name = ? AND user_password = ? AND user_is_delete = '0'";
		User user = new User();
		Object[] params = {userName, userPassword};
		try {
			user = query(sql, new ExpandBeanHandler<User>(User.class), params);
		} catch (SQLException e) {
			System.out.println("查询登录失败");
			e.printStackTrace();
		}
		return user;
	}
	
	
	/**
	 *  
	 * @Title: selectUser
	 * @Description: 查询全部用户
	 * @return: List<User>
	 */
	public List<User> selectUser() {
		String sql = "SELECT id, user_name, user_password, user_type, user_is_delete FROM user";
		List<User> list = new ArrayList<User>();
		try {
			list = query(sql, new ExpandBeanListHandler<User>(User.class));
		} catch (SQLException e) {
			System.out.println("查询全部用户失败");
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
}
