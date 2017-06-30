package com.dywz.common.vo;

import com.dywz.common.entity.News;

public class NewsVo extends News {

	private String userName;
	
	private String columnTitle;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getColumnTitle() {
		return columnTitle;
	}

	public void setColumnTitle(String columnTitle) {
		this.columnTitle = columnTitle;
	}
	
	
	
	
}
