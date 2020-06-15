<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>

<%
   // 세션 방식
   String id = (String)session.getAttribute("id");
   session.setMaxInactiveInterval(30*60); // 30분 (30*60초)  
%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.0.1">
    <title>Board Page</title>
    
   	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" >
    <link rel="stylesheet" href="css/board.css">
    
  </head>
  <body>
 	<!-- 헤더 임포트 -->
	<jsp:include page="include/header.jsp" flush="false"/>
	
	<div class="container-fluid">
	  <div class="row">
	    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
	      <div class="sidebar-sticky pt-3">
	        <ul class="nav flex-column">
	          <li class="nav-item">
	            <a class="nav-link" href="#">
	              <span data-feather="home"></span>
	              Dashboard <span class="sr-only">(current)</span>
	            </a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" href="#">
	              <span data-feather="file"></span>
	              Inbox
	            </a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" href="#">
	              <span data-feather="users"></span>
	              Subscription
	            </a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" href="#">
	              <span data-feather="bar-chart-2"></span>
	              Reports
	            </a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" href="#">
	              <span data-feather="layers"></span>
	              Profits
	            </a>
	          </li>
	        </ul>
	
	        <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
	          <span>Saved reports</span>
	          <a class="d-flex align-items-center text-muted" href="#" aria-label="Add a new report">
	            <span data-feather="plus-circle"></span>
	          </a>
	        </h6>
	        <ul class="nav flex-column mb-2">
	          <li class="nav-item">
	            <a class="nav-link" href="#">
	              <span data-feather="file-text"></span>
	              Current month
	            </a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" href="#">
	              <span data-feather="file-text"></span>
	              Last quarter
	            </a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" href="#">
	              <span data-feather="file-text"></span>
	              Social engagement
	            </a>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" href="#">
	              <span data-feather="file-text"></span>
	              Year-end
	            </a>
	          </li>
	        </ul>
	      </div>
	    </nav>
	
	    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
	      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
	        <h1 class="h2">조회수</h1>
	        <div class="btn-toolbar mb-2 mb-md-0">
	          <div class="btn-group mr-2">
	            <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
	            <button type="button" class="btn btn-sm btn-outline-secondary">Export</button>
	          </div>
 	          <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
	            <span data-feather="calendar"></span>
	            This week
	          </button>
	        </div>
	      </div>
	
	      <canvas class="my-4 w-100" id="myChart" width="900" height="380"></canvas>
	
	    </main>
	  </div>
	</div>

	<script src="https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.min.js"></script>
	<script src="js/board.js"></script>
</body>
</html>