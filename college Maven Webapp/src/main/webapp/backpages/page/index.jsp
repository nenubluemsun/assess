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
  
    <title>招生后台管理系统</title>
    <!--#include file="/newcms/backpages/page/common/link.html" -->
    <%@ include file="/backpages/page/common/link.jsp" %>
  </head>

  <body>
  <!-- container section start -->
  <section id="container" class="">
     
    <!--#include file="/newcms/backpages/page/common/header.html" -->
    <%@ include file="/backpages/page/common/header.jsp" %>
    <!--#include file="/newcms/backpages/page/common/sidebar.html"  -->
    <%@ include file="/backpages/page/common/sidebar.jsp" %>  
    
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">            
              <!--overview start-->
			  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-laptop"></i> 首页</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i>首页</li>
					</ol>
				</div>
			</div>
              
                       <div class="row">
                        <h1 align="center" style="margin-bottom: 50px;">欢迎来到东北师范大学信息科学与技术学院招生信息管理系统</h1>
                       </div>
		  
		  <!-- Today status end -->
			
              
				
   
      </section>
      <!--main content end-->
  </section>
  <!-- container section start -->

  <!--#include file="/newcms/backpages/page/common/script.html"  -->
  <%@ include file="/backpages/page/common/script.jsp" %>
  <script>

      //knob
      $(function() {
        $(".knob").knob({
          'draw' : function () { 
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //carousel
      $(document).ready(function() {
          $("#owl-slider").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true

          });
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });
	  
	  /* ---------- Map ---------- */
	$(function(){
	  $('#map').vectorMap({
	    map: 'world_mill_en',
	    series: {
	      regions: [{
	        values: gdpData,
	        scale: ['#000', '#000'],
	        normalizeFunction: 'polynomial'
	      }]
	    },
		backgroundColor: '#eef3f7',
	    onLabelShow: function(e, el, code){
	      el.html(el.html()+' (GDP - '+gdpData[code]+')');
	    }
	  });
	});

  </script>

  </body>
</html>

