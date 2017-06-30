package com.dywz.dao;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.dywz.common.core.AbstractDao;
import com.dywz.common.core.ExpandBeanHandler;
import com.dywz.common.core.ExpandBeanListHandler;
import com.dywz.common.entity.News;
import com.dywz.common.vo.NewsVo;
/**
 * 
 * @author 我要睡觉了
 * @Title NewsDao.java
 * @Description 新闻Dao层
 * @time 2017年5月19日 下午1:55:16
 */
public class NewsDao extends AbstractDao {

	/**
	 * 
	 * @Title: addNews
	 * @Description: 添加新闻
	 * @return: void
	 * @throws:
	 */
	public void addNews(News news) {
		String columnId = news.getColumnId();
		String userId = news.getUserId();
		String newsTitle = news.getNewsTitle();
		String newsContent = news.getNewsContent();
		Date newsDate = new Date();
		String sql = "INSERT INTO news (column_id, user_id, news_title, news_content, news_date) VALUES (?, ?, ?, ?, ?)";
		Object[] params = {columnId, userId, newsTitle, newsContent, newsDate};
		try {
			insert(sql, params);
		} catch (SQLException e) {
			System.out.println("增添新闻失败");
			e.printStackTrace();
		}		
	}
	
	
	/**
	 * 
	 * @Title: updateClick
	 * @Description: 修改点击量
	 * @return: void
	 * @throws:
	 */
	public void updateClick(String id) {
		String sql = "UPDATE news SET news_click = news_click + 1 WHERE id = ?";
		Object param = id;
		try {
			update(sql, param);
		} catch (SQLException e) {
			System.out.println("更新点击量失败");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * @Title: deleteNews
	 * @Description: 更改一条新闻显示状态
	 * @return: void
	 * @throws:
	 */
	public void deleteNews(String id, String value) {
		String sql = "UPDATE news SET news_is_delete = ? WHERE id = ?";
		Object[] params = {value, id};
		try {
			update(sql, params);
		} catch (SQLException e) {
			System.out.println("删除新闻失败");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * @Title: selectNews
	 * @Description: 查询所有可见的新闻
	 * @return: List<News>
	 */
	public List<NewsVo> selectNews(String columnId) {
		List<NewsVo> list = new ArrayList<NewsVo>();
		String sql = "SELECT news.id, user.user_name, column.column_title, news.user_id, news.column_id, news.news_title, news.news_content, news.news_date, news.news_click, news.news_is_delete FROM news INNER JOIN user ON news.user_id = user.id INNER JOIN `column` ON column.id = news.column_id WHERE news.column_id = ? AND news.news_is_delete = '0' ORDER BY news.news_date DESC";
		Object param = columnId;
		try {
			list = query(sql, new ExpandBeanListHandler<NewsVo>(NewsVo.class), param);
		} catch (SQLException e) {
			System.out.println("查询所有可见新闻失败");
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	/**
	 * 
	 * @Title: selectAllNews
	 * @Description: 查询所有新闻
	 * @return: List<News>
	 * @throws:
	 */
	public List<NewsVo> selectAllNews(String columnId) {
		List<NewsVo> list = new ArrayList<NewsVo>();
		String sql = "SELECT news.id, news.user_id, user.user_name, column.column_title, news.column_id, news.news_title, news.news_content, news.news_date, news.news_click, news.news_is_delete FROM news INNER JOIN user ON news.user_id = user.id INNER JOIN `column` ON column.id = news.column_id WHERE news.column_id = ? ORDER BY news.news_date DESC";
		Object param = columnId;
		try {
			list = query(sql, new ExpandBeanListHandler<NewsVo>(NewsVo.class), param);
		} catch (SQLException e) {
			System.out.println("查询所有新闻失败");
			e.printStackTrace();
		}
		return list;
	}
	
	
	/**
	 * 
	 * @Title: selectNews
	 * @Description: 查询一条新闻
	 * @return: List<News>
	 * @throws:
	 */
	public NewsVo selectOneNews(String id) {
		NewsVo news = new NewsVo();
		String sql = "SELECT news.id, news.user_id, user.user_name, column.column_title, news.column_id, news.news_title, news.news_content, news.news_date, news.news_click, news.news_is_delete FROM news INNER JOIN user ON news.user_id = user.id INNER JOIN `column` ON column.id = news.column_id WHERE news.id = ?";
		Object param = id;
		try {
			news = query(sql, new ExpandBeanHandler<NewsVo>(NewsVo.class), param);
		} catch (SQLException e) {
			System.out.println("查询一条新闻失败");
			e.printStackTrace();
		}
		return news;
	}
	
	

	
	public List<NewsVo> selectAllNewsWithoutC() {
		List<NewsVo> list = new ArrayList<NewsVo>();
		String sql = "SELECT news.id, news.user_id, user.user_name, column.column_title, news.column_id, news.news_title, news.news_content, news.news_date, news.news_click, news.news_is_delete FROM news INNER JOIN user ON news.user_id = user.id INNER JOIN `column` ON column.id = news.column_id ORDER BY news.news_date DESC";
		try {
			list = query(sql, new ExpandBeanListHandler<NewsVo>(NewsVo.class));
		} catch (SQLException e) {
			System.out.println("查询所有新闻失败");
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
}
