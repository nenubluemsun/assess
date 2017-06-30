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
              <li><i class="fa fa-th-list"></i>添加</li>
            </ol>
          </div>
        </div>
            <!-- page start -->
            <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              添加文章
                          </header>
                          <div class="panel-body">
                              <div class="form">
                                  <form class="form-validate form-horizontal" id="feedback_form" method="post" action="/college/ColumnController">
                                  	  <input type="hidden" name="flag" value="newsAdd">
                                      <div class="form-group ">
                                          <label for="cname" class="control-label col-lg-2">标题</label>
                                          <div class="col-lg-8">
                                              <input class="form-control" id="cname" name="newsTitle" minlength="5" type="text" required />
                                          </div>
                                      </div>
<!--                                       <div class="form-group ">
                                          <label for="cemail" class="control-label col-lg-2">作者</label>
                                          <div class="col-lg-8">
                                              <input class="form-control " id="cemail" type="text" name="email" required />
                                          </div>
                                      </div> -->
                                      <input name="userId" type="hidden" value="${sessionScope.user.id}">
                                      <div class="form-group ">
                                          <label for="curl" class="control-label col-lg-2">所属栏目</label>
                                          <div class="col-lg-8">
                                              <select class="form-control" name="columnId">
                                                <option selected="selected">请选择</option>
                                                <c:forEach var="columnVo" items="${columnList}">
                                                <option value="${columnVo.id}"><c:out value="${columnVo.columnTitle}" /></option>
                                                </c:forEach>
                                              </select>
                                          </div>
                                      </div>
                                     <!--  <div class="form-group">
                                          <label for="date" class="control-label col-lg-2">时间</label>
                                          <div class="col-lg-8">
                                              <input class="form-control" id="date" name="newsDate" minlength="5" type="text" disabled="disabled" />
                                          </div>
                                      </div>  -->                                     
                                      <div class="form-group">
                                          <label class="control-label col-sm-2">文章内容</label>
                                          <div class="col-sm-8">
                                              <textarea class="form-control ckeditor" name="newsContent" rows="6"></textarea>
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
    <script type="text/javascript" src="/backpages/page/assets/ckeditor/ckeditor.js"></script>
    <script type="text/javascript" src="/backpages/resources/js/common/common.js"></script>

  </body>
</html>
