package com.dywz.service;

import com.dywz.common.core.ServiceExtends;
import com.dywz.common.entity.News;

public class NewsService extends ServiceExtends {
	
	
	/**
	 * 
	 * @Title: addNews
	 * @Description: 添加
	 * @return: void
	 */
	public void addNews(News news) {
		newsDao.addNews(news);
	}
	
	
	/**
	 * 
	 * @Title: deleteNews
	 * @Description: 删除
	 * @return: void
	 */
	public void deleteNews(String id, String value) {
		newsDao.deleteNews(id, value);
	}
	
	
	/**
	 * 
	 * @Title: updateClick
	 * @Description: 修改点击量
	 * @return: void 
	 */
	public void updateClick(String id) {
		newsDao.updateClick(id);
	}
	

	/**
	 * 
	 * @Title: selectOneNews
	 * @Description: 查询一条新闻
	 * @return: News
	 */
	public News selectOneNews(String id) {
		News news = new News();
		news = newsDao.selectOneNews(id);
		return news;
	}
	
	
	
	
	
}
