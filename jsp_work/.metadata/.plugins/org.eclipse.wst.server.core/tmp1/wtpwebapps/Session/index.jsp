<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%  
    // 로그아웃 메세지 가져와 뿌리기
    String logoutMsg = request.getParameter("logoutMsg");
    if(logoutMsg !=null) {
    	out.println(
    		"<script> alert('"+ logoutMsg +"');"
    		+ "history.replaceState({},null, location.pathname);"
    		+ "</script>"
    	);
    }
%>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.0.1">
    <title>Index Page</title>

    <!-- Bootstrap and CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css" >
    
  </head>
  <body class="text-center">
  <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
   	<!-- 헤더 임포트 -->
	<jsp:include page="include/header.jsp" flush="false"/>
  	<main role="main" class="inner cover">
	    <h1 class="cover-heading">Online Lecture Services</h1>
	    <p class="lead">
	    	취향저격 강의 서비스 - 보다 나은 가치추구를 위한 무한 노력!<br>
			창의교육! 미래방송! 이제는 교육도 골라듣자!<br>
			대한민국 1등 온라인 강의 플랫폼<br>
		</p>
	    <p class="lead">
      		<a href="#" onclick="window.open('/Session/pricing.jsp', '', 'width=930, height=700')" class="btn btn-lg btn-secondary">Learn more</a>
    	</p>
  	</main>

</div>
</body>
</html>