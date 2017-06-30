package com.dywz.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.spi.RegisterableService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dywz.common.entity.User;
import com.dywz.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserService userService = new UserService();
	
	
	
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flag = request.getParameter("flag");
		switch (flag) {
		case "register": register(request, response);		
			break;
		case "login": login(request, response);
			break;
		case "vlogin": vlogin(request, response);
			break;
		case "logout": logout(request, response);
			break;
		case "userAllList": userAllList(request, response);
			break;
		case "updateUser": updateUser(request, response);
			break;
		case "userAdd": userAdd(request, response);
		default:
			break;
		}
	}

	
	// 用户注册
	public void register(HttpServletRequest request, HttpServletResponse response) throws IOException {
		User user = new User();
		user.setUserName(request.getParameter("username"));
		user.setUserPassword(request.getParameter("password"));
		user.setUserType(request.getParameter("usertype"));
		userService.addUser(user);
		response.sendRedirect("/college/frontpages/page/login.jsp");
	}
	
	
	// 用户登录
	public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		User user = new User();
		String userName = request.getParameter("username");
		String userPassword = request.getParameter("password");
		user = userService.selectOneUser(userName, userPassword);
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("/college/frontpages/page/index.jsp");
		}else {
			response.sendRedirect("/college/frontpages/page/login.jsp");
		}
		
	}
	
	

	// 管理员登录后台系统
	public void vlogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		User user = new User();
		String userName = request.getParameter("username");
		String userPassword = request.getParameter("password");
		user = userService.selectOneUser(userName, userPassword);
		System.out.println(user.getUserType());
		if(user != null && user.getUserType().equals("1")) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("/college/backpages/page/index.jsp");
		}else {
			response.sendRedirect("/college/backpages/page/login.jsp");
		}
	}
	
	
	
	public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		response.sendRedirect("/college/backpages/page/login.jsp");
	}
	
	
	
	public void userAllList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> userList = new ArrayList<User>();
		userList = userService.selectUser();
		List<String> typeList = new ArrayList<String>();
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUserType().equals("1")) {
				typeList.add("管理员");
			}else {
				typeList.add("普通用户");
			}
		}
		request.setAttribute("typeList", typeList);
		request.setAttribute("userList", userList);
		request.getRequestDispatcher("/backpages/page/user.jsp").forward(request, response);;
	}
	
	
	
	public void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String value = request.getParameter("value");
		userService.deleteUser(id, value);
		userAllList(request, response);
	}
	
	
	
	public void userAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setUserName(request.getParameter("username"));
		user.setUserPassword(request.getParameter("password"));
		user.setUserType(request.getParameter("usertype"));
		userService.addUser(user);
		userAllList(request, response);
	}
	
	
	
	
}
