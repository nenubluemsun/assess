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
    <link rel="shortcut icon" href="img/favicon.png">

    <title>学科研究后台管理系统-注册页面</title>

    <!--#include file="/newcms/backpages/page/common/link.html" -->
	<%@ include file="/backpages/page/common/link.jsp" %>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <script src="js/lte-ie7.js"></script>
    <![endif]-->
  </head>

  <body>
  <!-- container section start -->
  <section id="container" class="">
      <!--main content start-->
      <section class="wrapper">
              <!-- Form validations -->              
              <div class="row">
                  <div class="col-lg-8 register-control">
                      <section class="panel">
                          <header class="panel-heading">
                             <h1>账号注册</h1>
                          </header>
                          <div class="panel-body">
                              <div class="form">
                                  <form class="form-validate form-horizontal " id="register_form" method="get" action="/college/UserServlet">
                                  	  <input name="flag" type="hidden" value="userAdd">
                                      <div class="form-group ">
                                          <label for="fullname" class="control-label col-lg-2">用户名 <span class="required">*</span></label>
                                          <div class="col-lg-8">
                                              <input class="form-control" id="fullname" name="username" type="text" />
                                          </div>
                                      </div>
<!--                                       <div class="form-group ">
                                          <label for="address" class="control-label col-lg-2">账号 <span class="required">*</span></label>
                                          <div class="col-lg-8">
                                              <input class=" form-control" id="address" name="address" type="text" />
                                          </div>
                                      </div> -->
                                      <div class="form-group ">
                                          <label for="username" class="control-label col-lg-2">密码 <span class="required">*</span></label>
                                          <div class="col-lg-8">
                                              <input class="form-control " id="username" name="password" type="password" />
                                          </div>
                                      </div>
                                      
                                      <div class="form-group">
                                          <label for="username" class="control-label col-lg-2">注册用户类型 <span class="required">*</span></label>
                                          <div class="col-lg-8">
                                              <div class="radio">
                                                  <label>
                                                      <input type="radio" name="usertype" id="optionsRadios1" value="0" checked>
                                                      普通用户
                                                  </label>
                                              </div>
                                              <div class="radio">
                                                  <label>
                                                      <input type="radio" name="usertype" id="optionsRadios2" value="1">
                                                      管理员用户
                                                  </label>
                                              </div>
                                          </div>
                                      </div>
                                      <!-- <div class="form-group ">
                                          <label for="password" class="control-label col-lg-2">Password <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="password" name="password" type="password" />
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="confirm_password" class="control-label col-lg-2">Confirm Password <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="confirm_password" name="confirm_password" type="password" />
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="email" class="control-label col-lg-2">Email <span class="required">*</span></label>
                                          <div class="col-lg-10">
                                              <input class="form-control " id="email" name="email" type="email" />
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="agree" class="control-label col-lg-2 col-sm-3">Agree to Our Policy <span class="required">*</span></label>
                                          <div class="col-lg-10 col-sm-9">
                                              <input  type="checkbox" style="width: 20px" class="checkbox form-control" id="agree" name="agree" />
                                          </div>
                                      </div> -->
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <input class="btn btn-primary" type="submit" value="提交">
                                              <a class="btn btn-default" href="login.html">返回登录</a>
                                          </div>
                                      </div>
                                  </form>
                              </div>
                          </div>
                      </section>
                  </div>
              </div>
              <!-- page end-->
          </section>
  </section>
  <!-- container section end -->
  <!--#include file="/newcms/backpages/page/common/script.html" -->
  <%@ include file="/backpages/page/common/script.jsp" %>
  </body>
</html>
