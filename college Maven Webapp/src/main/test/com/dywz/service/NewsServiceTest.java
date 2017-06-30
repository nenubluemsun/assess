package com.dywz.service;

import org.junit.Test;

import com.dywz.common.entity.News;

public class NewsServiceTest {
     
	NewsService newsService = new NewsService();
	@Test
	public void testAddNews() {
		News news = new News();
		
		news.setColumnId("29a741b5-73f6-47ad-ab31-5fb5a0f222b3");
		news.setNewsClick(6);
		news.setNewsContent("测试一下junit添加新闻");
		news.setNewsTitle("junit测试添加新闻");
		news.setUserId("354fc531-0b87-480a-8b48-d98045877ae5");
		
		newsService.addNews(news);		
	}

	

	@Test
	public void testUpdateClick() {
		String id="d86d312c-a340-4893-94cc-4a5022dc0059";
		newsService.updateClick(id);
	}

	@Test
	public void testSelectOneNews() {
		String id="d86d312c-a340-4893-94cc-4a5022dc0059";
		News list= newsService.selectOneNews(id);
		System.out.println(list.getNewsTitle());
		
	}

}
