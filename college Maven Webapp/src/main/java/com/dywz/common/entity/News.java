package com.dywz.common.entity;

import java.sql.Date;

/**
 * 
 * @author 我要睡觉了
 * @Title News.java
 * @Description 新闻
 * @time 2017年5月16日 下午7:49:45
 */
public class News {

	private String id;
	
	private String columnId;
	
	private String userId;
	
	private String newsTitle;
		
	private String newsContent;
	
	private Date newsDate;
	
	private int newsClick;
	
	private String newsIsDelete;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNewsIsDelete() {
		return newsIsDelete;
	}

	public void setNewsIsDelete(String newsIsDelete) {
		this.newsIsDelete = newsIsDelete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public Date getNewsDate() {
		return (Date) newsDate.clone();
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	public int getNewsClick() {
		return newsClick;
	}

	public void setNewsClick(int newsClick) {
		this.newsClick = newsClick;
	}
	

	
}
