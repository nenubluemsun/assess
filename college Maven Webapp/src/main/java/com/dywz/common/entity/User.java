package com.dywz.common.entity;
/**
 * 
 * @author 我要睡觉了
 * @Title User.java
 * @Description 用户实体类
 * @time 2017年6月13日 下午7:09:33
 */
public class User {

	private String id;
	
	private String userName;
	
	private String userPassword;
	
	private String userType;
	
	private String userIsDelete;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserIsDelete() {
		return userIsDelete;
	}

	public void setUserIsDelete(String userIsDelete) {
		this.userIsDelete = userIsDelete;
	}
	
	
	
	
}
