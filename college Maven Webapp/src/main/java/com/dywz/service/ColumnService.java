package com.dywz.service;

import java.util.ArrayList;
import java.util.List;

import com.dywz.common.core.ServiceExtends;
import com.dywz.common.entity.Column;
import com.dywz.common.entity.News;
import com.dywz.common.vo.ColumnVo;
import com.dywz.common.vo.NewsVo;

public class ColumnService extends ServiceExtends {

	
	/**
	 * 
	 * @Title: addColumn
	 * @Description: 添加一个栏目
	 * @return: void
	 */
	public void addColumn(Column column) {
		columnDao.addColumn(column);
	}
	
	
	/**
	 * 
	 * @Title: deleteColumn
	 * @Description: 更改栏目的显示状态
	 * @return: void
	 */
	public void deleteColumn(String id, String value) {
		columnDao.deleteColumn(id, value);
	}
	
	
	/**
	 * 
	 * @Title: updateColumn
	 * @Description: 更改栏目内容
	 * @return: void
	 */
	public void updateColumn(Column column, String id) {
		columnDao.updateColumn(column, id);
	}
	
	
	/**
	 * 
	 * @Title: selectColumn
	 * @Description: 查询所有可见栏目及其所包含的新闻
	 * @return: List<ColumnVo>
	 */
	public List<ColumnVo> selectColumn() {
		List<ColumnVo> list = new ArrayList<ColumnVo>();
		list = columnDao.selectColumn();
/*		for(int i = 0; i < list.size(); i++) {
			String columnId = list.get(i).getId();
			List<News> newsList = new ArrayList<News>();
			newsList =  newsDao.selectNews(columnId);
			list.get(i).setNewsList(newsList);
		}*/
		return list;
	}
	
	
	/**
	 *  
	 * @Title: selectAllColumn
	 * @Description: 查询所有可见栏目及新闻
	 * @return: List<ColumnVo>
	 */
	public List<ColumnVo> selectAllColumn() {
		List<ColumnVo> list = new ArrayList<ColumnVo>();
		list = columnDao.selectAllColumn();
/*		for(int i = 0; i < list.size(); i++) {
			String columnId = list.get(i).getId();
			List<News> newsList = new ArrayList<News>();		
			newsList =  newsDao.selectAllNews(columnId);
			list.get(i).setNewsList(newsList);
		}*/
		return list;
	}
	
	
	/**
	 *  
	 * @Title: selectOneColumnVo
	 * @Description: 查询一条二级栏目信息
	 * @return: ColumnVo
	 */
	public ColumnVo selectOneColumnVo(String id) {
		ColumnVo columnVo = new ColumnVo();
		columnVo = columnDao.selectOneColumn(id);
		return columnVo;
	}
	
	
	public List<NewsVo> selectNews(String columnId) {
		List<NewsVo> newsList = new ArrayList<NewsVo>();		
		newsList =  newsDao.selectNews(columnId);
		return newsList;
	}
	
	
	public List<NewsVo> selectAllNews(String columnId) {
		List<NewsVo> newsList = new ArrayList<NewsVo>();		
		newsList =  newsDao.selectAllNews(columnId);
		return newsList;
	}
	
	
	public void updateClick(String id) {
		newsDao.updateClick(id);
	}
	
	
	public NewsVo selectOneNews(String id) {
		NewsVo newsVo = new NewsVo();
		newsVo = newsDao.selectOneNews(id);
		return newsVo;
	}
	
	
	public List<NewsVo> selectAllNewsWithoutC() {
		List<NewsVo> newsList = new ArrayList<NewsVo>();		
		newsList =  newsDao.selectAllNewsWithoutC();
		return newsList;
	}
	
	
	public void deleteNews(String id, String value) {
		newsDao.deleteNews(id, value);
	}
	
	
	public void addNews(News news) {
		newsDao.addNews(news);
	}
	
	
	
	
	
	
	
}
