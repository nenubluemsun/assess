<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <%@ include file="/backpages/page/common/link.jsp" %>
    <link rel="shortcut icon" href="img/favicon.png">

    <title>登录页面</title>
    <!--#include file="/newcms/backpages/page/common/link.html" -->
	
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

  <body class="login-img3-body">

    <div class="container">

      <form class="login-form" action="/college/UserServlet">        
        <input name="flag" type="hidden" value="login">
        <div class="login-wrap">
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <input type="text" name="username" class="form-control" placeholder="请填写账号..." autofocus>
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" name="password" class="form-control" placeholder="请填写密码...">
            </div>
            <label class="checkbox">
                <input type="checkbox" value="remember-me"> 记住密码
            </label>
            <button class="btn btn-primary btn-lg btn-block" type="submit">登录</button>
            <a class="btn btn-info btn-lg btn-block" href="register.html">注册</a>
        </div>
      </form>
  </body>
</html>

