<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">

<head>
    <title>信息科学与技术学院-招生信息</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Free Bootstrap Business Template">
    <meta name="author" content="The Develovers">
    <!--#include file="/newcms/frontpages/page/common/link.html"  -->
    <%@ include file="/frontpages/page/common/link.jsp" %>
</head>

<body>
    <!-- WRAPPER -->
    <div class="wrapper">
        <!--#include file="/newcms/frontpages/page/common/header.html"  --> 
        <%@ include file="/frontpages/page/common/header.jsp" %>
        <!-- BREADCRUMBS -->
        <div class="page-header">
            <div class="container">
                <h1 class="page-title pull-left">招生信息</h1>
                <ol class="breadcrumb">
                    <li><a href="index.html">首页</a></li>
                    <li class="active">招生信息</li>
                </ol>
            </div>
        </div>
        <!-- END BREADCRUMBS -->
        <!-- PAGE CONTENT -->
        <div class="page-content">
            <div class="container">
                <div class="row">  
                    <div class="col-md-3">
                        <div class="widget">
                            <h4 class="widget-title">招生信息</h4>
                            <ul class="list-unstyled category-list">
                            	<c:forEach var="columnVo" items="${columnList}">
									<li><a href="/college/ColumnController?flag=tolist&columnId=${columnVo.id}"><c:out value="${columnVo.columnTitle}"/></a></li>                             
<!--                            <li><a href="#">本科生招生</a></li>
                                <li><a href="#">硕士生招生</a></li>
                                <li><a href="#">博士生招生</a></li>
                                <li><a href="#">资助信息</a></li>
 -->                               
                            	</c:forEach>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-9">
                        <!-- BLOG ENTRIES -->
                        <div class="blog medium-thumbnail margin-bottom-30px">
                            <!-- blog post -->
							<c:forEach var="newsVo" items="${newsList}">
                            <article class="entry-post">
                                <header class="entry-header">
                                    <h2 class="entry-title"">
                                    	<a href="/college/ColumnController?flag=toContent&newsId=${newsVo.id}"><c:out value="${newsVo.newsTitle}" /></a>
                                	</h2>
                                    <div class="meta-line clearfix">
                                        <div class="meta-author-category pull-left">
                                            <span class="post-author">作者： <c:out value="${newsVo.userName}" /></span>
                                            <span class="post-category">时间：<c:out value="${newsVo.newsDate}" />
                                        </div>
<!--                                         <div class="meta-tag-comment pull-right">
                                            <span class="post-comment"><i class="fa fa-comments"></i> 3 条评论</span>
                                        </div> -->
                                    </div>
                                </header>
                            </article>
                            </c:forEach>
                            <!-- end blog post -->
                            <hr />
                            <!-- blog post -->
<!--                             <article class="entry-post">
                                <header class="entry-header">
                                    <h2 class="entry-title"">
                                    <a href="content.html">关于研究生招生办法</a>
                                </h2>
                                    <div class="meta-line clearfix">
                                        <div class="meta-author-category pull-left">
                                            <span class="post-author">作者： <a href="#">小王</a></span>
                                            <span class="post-category">时间：2017-06-08 14:30:23
                                        </div>
                                        <div class="meta-tag-comment pull-right">
                                            <span class="post-comment"><i class="fa fa-comments"></i> 3 条评论</span>
                                        </div>
                                    </div>
                                </header>
                            </article>
                            <hr /> -->
                            <!-- end blog post -->
                        </div>
                        <!-- END BLOG ENTRIES -->
                        <!-- <ul class="pager">
                            <li><a href="#">上一页</a></li>
                            <li><a href="#">下一页</a></li>
                        </ul> -->
                    </div>   
                </div>
            </div>
        </div>
        <!-- END PAGE CONTENT -->
        <!--#include file="/newcms/frontpages/page/common/footer.html"  -->
        <%@ include file="/frontpages/page/common/footer.jsp" %>
    </div>
    <!-- END WRAPPER -->
    <!--#include file="/newcms/frontpages/page/common/script.html" -->
    <%@ include file="/frontpages/page/common/script.jsp" %>
</body>

</html>
