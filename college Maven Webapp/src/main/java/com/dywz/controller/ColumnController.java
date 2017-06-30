package com.dywz.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dywz.common.entity.Column;
import com.dywz.common.entity.News;
import com.dywz.common.vo.ColumnVo;
import com.dywz.common.vo.NewsVo;
import com.dywz.service.ColumnService;


@WebServlet("/ColumnController")
public class ColumnController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static ColumnService columnService = new ColumnService();   

    public ColumnController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flag = request.getParameter("flag");
		switch (flag) {
		case "tolist": toList(request, response);
			break;
		case "toContent": toContent(request, response);
			break;
		case "columnAllList": columnAllList(request, response);
			break;
		case "updateIsDelete": updateIsDelete(request, response);
			break;
		case "columnAdd": columnAdd(request, response);
			break;
		case "newsAllList": newsAllList(request, response);
			break;
		case "updateNews": updateNews(request, response);
			break;
		case "toNewsAdd": toNewsAdd(request, response);
			break;
		case "newsAdd": newsAdd(request, response);
			break;
		default:
			break;
		}
	}
	
	
	
	public void toList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String columnId = request.getParameter("columnId");
		List<ColumnVo> columnList = new ArrayList<ColumnVo>();
		List<NewsVo> newsList = new ArrayList<NewsVo>();
		columnList = columnService.selectColumn();
		if(columnId == null) {
			columnId = columnList.get(0).getId();
		}
		newsList = columnService.selectNews(columnId);
		request.setAttribute("columnList", columnList);
		request.setAttribute("newsList", newsList);
		request.getRequestDispatcher("/frontpages/page/list.jsp").forward(request, response);
	}
	
	
	
	
	
	public void toContent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newsId = request.getParameter("newsId");
		List<ColumnVo> columnList = new ArrayList<ColumnVo>();
		List<NewsVo> newsList = new ArrayList<NewsVo>();
		columnList = columnService.selectColumn();
		NewsVo newsVo = new NewsVo();
		columnService.updateClick(newsId);
		newsVo = columnService.selectOneNews(newsId);
		request.setAttribute("columnList", columnList);
		request.setAttribute("newsVo", newsVo);
		request.getRequestDispatcher("/frontpages/page/content.jsp").forward(request, response);
	}
	
	
	
	
	public void columnAllList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ColumnVo> list = new ArrayList<ColumnVo>();
		list = columnService.selectAllColumn();
		request.setAttribute("columnList", list);
		request.getRequestDispatcher("/backpages/page/column.jsp").forward(request, response);
	}
	
	
	
	public void updateIsDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value = request.getParameter("value");
		String id = request.getParameter("columnId");
		columnService.deleteColumn(id, value);
		columnAllList(request, response);
	}
	
	
	
	
	public void columnAdd(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Column column = new Column();
		column.setColumnTitle(request.getParameter("columnTitle"));
		column.setColumnInfo(request.getParameter("columnInfo"));
		columnService.addColumn(column);
		response.sendRedirect("/college/backpages/page/column-add.jsp");
	}
	
	
	
	public void newsAllList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<NewsVo> newsList = new ArrayList<NewsVo>();
		newsList = columnService.selectAllNewsWithoutC();
		request.setAttribute("newsList", newsList);
		request.getRequestDispatcher("/backpages/page/article.jsp").forward(request, response);
	}
	
	
	public void updateNews(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value = request.getParameter("value");
		String id = request.getParameter("newsId");
		columnService.deleteNews(id, value);
		newsAllList(request, response);
	}
	
	
	
	
	public void toNewsAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ColumnVo> list = new ArrayList<ColumnVo>();
		list = columnService.selectColumn();
		request.setAttribute("columnList", list);
		request.getRequestDispatcher("/backpages/page/article-add.jsp").forward(request, response);
	}
	
	
	public void newsAdd(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		News news = new News();
		news.setNewsTitle(request.getParameter("newsTitle"));
		news.setUserId(request.getParameter("userId"));
		news.setNewsContent(request.getParameter("newsContent"));
		news.setColumnId(request.getParameter("columnId"));
		columnService.addNews(news);
		toNewsAdd(request, response);
	}
	
	
	
	
	
	

}
