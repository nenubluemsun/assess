package com.dywz.common.utils;

import java.io.IOException;

import javax.security.auth.login.LoginContext;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dywz.common.entity.User;

public class userFilter extends AbstractFilter {

	
	public static boolean isContains(String uri, String[] notNeeds) {
		boolean flag = false;
		for(int i = 0; i < notNeeds.length; i++) {
			if(uri.contains(notNeeds[i])) {
				return true;
			}
		}
		return flag;
	}
	
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		// 获取session
		HttpSession session = request.getSession();
		// 获取访问路径
		String uri = request.getRequestURI();
		String tail = uri.substring(uri.lastIndexOf("/") + 1);
		String temp = config.getInitParameter("not");
		String[] notNeeds = temp.trim().split(",");
		if(isContains(tail, notNeeds)) {
			chain.doFilter(request, response);
		}else {
			User user = (User) session.getAttribute("user");
			if(user == null) {
				if(uri.contains("frontpages")) {
					response.sendRedirect("frontpages/page/login.jsp");
					return;
				}else if(uri.contains("backpages")) {
					response.sendRedirect("backpages/page/login.jsp");
					return;
				}else {
					response.sendRedirect("frontpages/page/login.jsp");
					return;
				}
			}else {
				chain.doFilter(request, response);
			}
		}
		
		
		
	}

}
