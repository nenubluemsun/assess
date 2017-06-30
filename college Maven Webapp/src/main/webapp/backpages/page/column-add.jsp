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

    <title>招生信息管理系统</title>

    <!--#include file="/newcms/backpages/page/common/link.html"  -->
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
      <!--#include file="/newcms/backpages/page/common/header.html"  -->
      <%@ include file="/backpages/page/common/header.jsp" %>
      <!--sidebar start-->
      <!--#include file="/newcms/backpages/page/common/sidebar.html" -->
	  <%@ include file="/backpages/page/common/sidebar.jsp" %>
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-table"></i> 栏目管理</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">首页</a></li>
						<li><i class="fa fa-table"></i>栏目管理</li>
						<li><i class="fa fa-pencil-square-o"></i>添加</li>
					</ol>
				</div>
		  </div>
            <!-- page start -->
            <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              添加栏目
                          </header>
                          <div class="panel-body">
                              <div class="form">
                                  <form class="form-validate form-horizontal" id="feedback_form" method="post" action="/college/ColumnController">
                                  	  <input name="flag" value="columnAdd" type="hidden">
                                      <div class="form-group ">
                                          <label for="cname" class="control-label col-lg-2">栏目名称 </label>
                                          <div class="col-lg-8">
                                              <input class="form-control" id="cname" name="columnTitle" minlength="5" type="text" required />
                                          </div>
                                      </div>
                                      <div class="form-group ">
                                          <label for="cemail" class="control-label col-lg-2">栏目备注 </label>
                                          <div class="col-lg-8">
                                              <input class="form-control " id="cemail" type="text" name="columnInfo" required />
                                          </div>
                                      </div>
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-8">
                                              <input class="btn btn-primary" type="submit" value="添加">
                                              <a class="btn btn-default" href="index.jsp">返回首页</a>
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
      <!--main content end-->
  </section>
  <!-- container section end -->
    <!--#include file="/newcms/backpages/page/common/script.html"  -->
	<%@ include file="/backpages/page/common/script.jsp" %>

  </body>
</html>
