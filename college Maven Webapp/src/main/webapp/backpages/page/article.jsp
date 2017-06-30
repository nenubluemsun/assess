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
					<h3 class="page-header"><i class="icon_documents_alt"></i> 文章管理</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">首页</a></li>
						<li><i class="icon_document_alt"></i>文章管理</li>
						<li><i class="fa fa-th-list"></i>文章管理列表</li>
					</ol>
				</div>
		  </div>
            <!-- page start -->
            <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              文章管理列表
                          </header>
                          
                          <table class="table table-striped table-advance table-hover">
                           <tbody>
                              <tr>
                                 <th><i class="fa fa-book"></i> 标题</th>
                                 <th><i class="icon_profile"></i> 作者</th>
                                 <th><i class="icon_calendar"></i> 时间</th>
                                 <th><i class="fa fa-th-list"></i> 所属栏目</th>
                                 <th><i class="fa fa-eye"></i> 是否在页面显示</th>
                                 <th><i class="icon_cogs"></i> 操作</th>
                              </tr>
                              <c:forEach var="newsVo" items="${newsList}">
                              <tr>
                                 <td><c:out value="${newsVo.newsTitle}" /></td>
                                 <td><c:out value="${newsVo.userName}" /></td>
                                 <td><c:out value="${newsVo.newsDate}" /></td>
                                 <td><c:out value="${newsVo.columnTitle}" /></td>
                                 <td>
                                 	<c:if test="${newsVo.newsIsDelete == 1}">
                                 	<c:out value="不显示" />
                                 	</c:if>
                                 	<c:if test="${newsVo.newsIsDelete == 0}">
                                 	<c:out value="显示" />
                                 	</c:if>
                                 </td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="/college/ColumnController?flag=updateNews&value=1&newsId=${newsVo.id}">
                                        <i class="fa fa-eye-slash"></i>
                                        不显示
                                      </a>
                                      <a class="btn btn-success" href="/college/ColumnController?flag=updateNews&value=0&newsId=${newsVo.id}">
                                        <i class="fa fa-eye"></i>
                                        显示
                                      </a>
<!--                                       <a class="btn btn-danger" href="#">
                                        <i class="icon_close_alt2"></i>
                                        删除
                                      </a> -->
                                  </div>
                                  </td>
                              </tr>
                              </c:forEach>
                             <!--  <tr>
                                 <td>关于今年研究生生招生详情办法</td>
                                 <td>管理员2</td>
                                 <td>2017-09-09 14:30:23</td>
                                 <td>研究生招生</td>
                                 <td>不显示</td>
                                 <td>
                                  <div class="btn-group">
                                      <a class="btn btn-primary" href="#">
                                        <i class="fa fa-eye-slash"></i>
                                        不显示
                                      </a>
                                      <a class="btn btn-success" href="#">
                                        <i class="fa fa-eye"></i>
                                        显示
                                      </a>
                                      <a class="btn btn-danger" href="#">
                                        <i class="icon_close_alt2"></i>
                                        删除
                                      </a>
                                  </div>
                                  </td>
                              </tr>                     -->     
                           </tbody>
                        </table>
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
