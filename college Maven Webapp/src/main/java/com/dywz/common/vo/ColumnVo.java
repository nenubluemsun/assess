package com.dywz.common.vo;

import java.util.ArrayList;
import java.util.List;

import com.dywz.common.entity.Column;
import com.dywz.common.entity.News;

/**
 * 
 * @author 我要睡觉了
 * @Title ColumnVo.java
 * @Description 二级栏目Vo
 * @time 2017年5月19日 下午1:40:31
 */
public class ColumnVo extends Column {

	List<News> newsList = new ArrayList<News>();

	public List<News> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}
	
	
	
}
