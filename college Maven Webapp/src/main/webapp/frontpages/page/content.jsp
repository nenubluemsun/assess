<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <title>信息科学与技术学院</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Free Bootstrap Business Template">
    <meta name="author" content="The Develovers">
    <!--#include file="/newcms/frontpages/page/common/link.html" -->
    <%@ include file="/frontpages/page/common/link.jsp" %>
    <style>
        .entry-header{
            padding-bottom: 30px;
            border-bottom: 1px solid #eaeaea;
        }
    </style>
</head>

<body>
    <!-- WRAPPER -->
    <div class="wrapper">
        <!--#include file="/newcms/frontpages/page/common/header.html" -->
        <%@ include file="/frontpages/page/common/header.jsp" %>
        <!-- BREADCRUMBS -->
        <div class="page-header">
            <div class="container">
                <h1 class="page-title pull-left">招生信息</h1>
                <ol class="breadcrumb">
                    <li><a href="index.html">首页</a></li>
                    <li class="active"><a href="list.html">招生信息</a></li>
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
                        <!-- BLOG SINGLE -->
                        <div class="blog single full-thumbnail">
                            <!-- blog post -->
                            <article class="entry-post">
                                <header class="entry-header">
                                    <h2 class="entry-title" align="center">
									<c:out value="${newsVo.newsTitle}" />
								</h2>
                                    <div class="meta-line clearfix">
                                        <div class="meta-author-category pull-left">
                                            <span class="post-author">作者： <c:out value="${newsVo.userName}" /></span>
                                            <span class="post-category">时间：<c:out value="${newsVo.newsDate}" />
                                        </div>
                                        <div class="meta-tag-comment pull-right">
                                            <span class="post-comment"><i class="fa fa-comments"></i> 点击量(<c:out value="${newsVo.newsClick}" />)</span>
                                        </div>
                                    </div>
                                </header>
                                <div class="entry-content clearfix">
                                    <figure class="featured-image">
                                        <img src="assets/img/blog/buildings.jpg" class="img-responsive" alt="featured-image" />
                                    </figure>
                                    <div class="excerpt">
                                        <p><c:out value="${newsVo.newsContent}" /></p>
                                        <!-- <blockquote>
                                            <p>Professionally revolutionize business channels and interactive imperatives. Competently visualize virtual collaboration and idea-sharing after bleeding-edge testing procedures. Monotonectally implement synergistic schemas vis-a-vis fully tested metrics.</p>
                                        </blockquote> -->
                                    </div>
                                </div>
                            </article>
                            <!-- end blog post -->
                            <hr>
                            <!-- social sharing -->
                            <div class="social-sharing clearfix">
                                <h3 class="section-heading pull-left">分享到: </h3>
                                <ul class="list-inline sharing-tools">
                                    <li><a href="#" class="facebook-bg"><i class="fa fa-renren"></i></a></li>
                                    <li><a href="#" class="twitter-bg"><i class="fa fa-wechat"></i></a></li>
                                    <li><a href="#" class="googleplus-bg"><i class="fa fa-qq"></i></a></li>
                                    <li><a href="#" class="rss-bg"><i class="fa fa-weibo"></i></a></li>
                                </ul>
                            </div>
                            <!-- end social sharing -->
                            <hr>

                            <article class="comments" id="comments">
                                <h3 class="section-heading">评论（3）：</h3>
                                <ul class="media-list">
                                    <li class="media">
                                        <div class="media child">
                                            <a href="#" class="media-left">
                                                <span class="avatar anonymous"><i class="fa fa-user"></i></span>
                                            </a>
                                            <div class="media-body">
                                                <h4 class="media-heading comment-author"><a href="#">王</a></h4><span class="timestamp text-muted">Dec 11, 2014 12:30 PM</span>
                                                <div>Conveniently administrate prospective e-tailers via global initiatives.</div>
                                                <a href="#"><i class="fa fa-reply"></i> 回复</a>
                                                <div class="media comment-by-author">
                                                    <a href="#" class="media-left">
                                                        <span class="avatar anonymous"><i class="fa fa-user"></i></span>
                                                    </a>
                                                    <div class="media-body">
                                                        <h4 class="media-heading comment-author">
                                                        <a href="#">王先生</a> 回复: <a href="#">王</a>
                                                        </h4>
                                                        <span class="timestamp text-muted">Dec 12, 2014 18:40 PM</span>
                                                        <div>Energistically </div>
                                                        <a href="#"><i class="fa fa-reply"></i> 回复</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                            <hr>
                                        <div class="media child">
                                            <a href="#" class="media-left">
                                                <span class="avatar anonymous"><i class="fa fa-user"></i></span>
                                            </a>
                                            <div class="media-body">
                                                <h4 class="media-heading comment-author"><a href="#">Anonymous</a></h4><span class="timestamp text-muted">8 hours ago</span>
                                                <div>Compellingly incentivize pandemic products for holistic total li</div>
                                                <a href="#"><i class="fa fa-reply"></i> 回复
                                        </div>
                                            <hr>
                                    </li>
                                </ul>
                            </article>
 
                            <section class="comment-form margin-bottom">
                                <h3 class="section-heading">添加评论：</h3>
                                <form class="form-horizontal comment-form" role="form">
                                    <div class="form-group">
                                        <label for="comment-text" class="control-label sr-only">提交评论</label>
                                        <div class="col-sm-12">
                                            <textarea class="form-control ckeditor" name="editor1" id="comment-text" rows="6" placeholder="请输入评论..."></textarea>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-12">
                                            <input type="submit" class="btn btn-primary" value="提交评论">
                                        </div>
                                    </div>
                                </form>
                            </section>
                        </div>
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
    <script type="text/javascript" src="/college/backpages/page/assets/ckeditor/ckeditor.js"></script>
</body>
</html>
