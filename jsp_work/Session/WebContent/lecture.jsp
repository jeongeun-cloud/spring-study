<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   // 세션 방식
   String id = (String)session.getAttribute("id");
   session.setMaxInactiveInterval(30*60); // 30분(30*60초)
%>
    
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.0.1">
    <title>Lecture Page</title>
    
    <!-- Bootstrap and CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" >
	<link rel="stylesheet" href="css/lecture.css" >
  </head>
  <body>
    <!-- 헤더 임포트 -->
	<jsp:include page="include/header.jsp" flush="false"/>

	<main role="main">
	  <section class="jumbotron text-center">
	    <div class="container">
	      <h1>Online Lecture Services</h1>
	      
	      <p class="lead text-muted">취향저격 강의 서비스 - 보다 나은 가치추구를 위한 무한 노력! <br>창의교육! 미래방송! 이제는 교육도 골라듣자! <br>대한민국 1등 온라인 강의 플랫폼</p>
	      <p>
	        <a href="#" class="btn btn-primary my-2">강의 등록 문의</a>
	        <a href="#" class="btn btn-secondary my-2">광고 등록 문의</a>
	      </p>
	    </div>
	  </section>
    
    <!-- 썸네일 시작 -->
	  <div class="album py-5 bg-light">
	    <div class="container">
	      <div class="row">
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	          	<img alt="" src="img/ch6_1.PNG" class="youtube_img" >
	            <div class="card-body">
	              <p class="card-text">ch6-1 객체지향 언어에 대한 강의입니다. 객체지향 언어와 공부방법에 대한 강의입니다.</p>
	              <div class="d-flex justify-content-between align-items-center">
	                <div class="btn-group">
	                  <button type="button" onclick="location.href='https://www.youtube.com/watch?v=CXuA31XcBZ0'" class="btn btn-sm btn-outline-secondary">View</button>
	                  <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
	                </div>
	                <small class="text-muted">21 mins</small>
	              </div>
	            </div>
	          </div>
	        </div>
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	          <img alt="" src="img/ch6_2.PNG" class="youtube_img" >
	            <div class="card-body">
	              <p class="card-text">ch6-2~4 클래스와객체에 대한 강의입니다.<br><br><br></p>
	              <div class="d-flex justify-content-between align-items-center">
	                <div class="btn-group">
	                  <button type="button" onclick="location.href='https://www.youtube.com/watch?v=jnhvQr1iDRE'" class="btn btn-sm btn-outline-secondary">View</button>
	                  <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
	                </div>
	                <small class="text-muted">14 mins</small>
	              </div>
	            </div>
	          </div>
	        </div>
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	            <img alt="" src="img/ch6_3.PNG" class="youtube_img" >
	            <div class="card-body">
	              <p class="card-text">ch6-6, 7 객체의 생성과 사용 방법에 대한 강의입니다.<br><br></p>
	              <div class="d-flex justify-content-between align-items-center">
	                <div class="btn-group">
	                  <button type="button" onclick="location.href='https://www.youtube.com/watch?v=p1ZZnM715ao'" class="btn btn-sm btn-outline-secondary">View</button>
	                  <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
	                </div>
	                <small class="text-muted">27 mins</small>
	              </div>
	            </div>
	          </div>
	        </div>
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	            <img alt="" src="img/dog1.PNG" class="youtube_img">
	            <div class="card-body">
	              <p class="card-text">유기견을 임시 보호 하다가 입양 보내면 다시 버려진다고 생각하나요?｜강형욱의 소소한 Q&A</p>
	              <div class="d-flex justify-content-between align-items-center">
	                <div class="btn-group">
	                  <button type="button" onclick="location.href='https://www.youtube.com/watch?v=YdiiFX1T8ZY'" class="btn btn-sm btn-outline-secondary">View</button>
	                  <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
	                </div>
	                <small class="text-muted">2 mins</small>
	              </div>
	            </div>
	          </div>
	        </div>
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	            <img alt="" src="img/dog2.PNG" class="youtube_img">
	            <div class="card-body">
	              <p class="card-text">강아지들이 노즈워크를 계속하면 질리나요?｜강형욱의 소소한 Q&A<br><br></p>
	              <div class="d-flex justify-content-between align-items-center">
	                <div class="btn-group">
	                  <button type="button" onclick="location.href='https://www.youtube.com/watch?v=VYOXggvZSHI'" class="btn btn-sm btn-outline-secondary">View</button>
	                  <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
	                </div>
	                <small class="text-muted">3 mins</small>
	              </div>
	            </div>
	          </div>
	        </div>
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	          	<img alt="" src="img/dog3.PNG" class="youtube_img">
	            <div class="card-body">
	              <p class="card-text">강아지가 헥헥댈 때 웃는 건지 긴장한 건지 구분할 수 있나요? ｜강형욱의 소소한 Q&A<br><br></p>
	              <div class="d-flex justify-content-between align-items-center">
	                <div class="btn-group">
	                  <button type="button" onclick="location.href='https://www.youtube.com/watch?v=kYUGSfyo2mI'" class="btn btn-sm btn-outline-secondary">View</button>
	                  <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
	                </div>
	                <small class="text-muted">2 mins</small>
	              </div>
	            </div>
	          </div>
	        </div>
	
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	            <img alt="" src="img/cook1.png" class="youtube_img">
	            <div class="card-body">
	              <p class="card-text">오늘은 집에서 간단하게 해드실 수 있는 집밥 레시피를 알려드릴게요. 달걀이 소스랑 만나서 아~주 부드럽습니다!</p>
	              <div class="d-flex justify-content-between align-items-center">
	                <div class="btn-group">
	                  <button type="button" onclick="location.href='https://www.youtube.com/watch?v=AlK2Gl6kHZI'"class="btn btn-sm btn-outline-secondary">View</button>
	                  <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
	                </div>
	                <small class="text-muted">17 mins</small>
	              </div>
	            </div>
	          </div>
	        </div>
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	            <img alt="" src="img/cook2.png" class="youtube_img">
	            <div class="card-body">
	              <p class="card-text">짜장 덮밥에 달걀 후라이 하나 올리면 끝! 이거 완전 밥도둑입니다! 만들어 놓은 짜장소스로 덮밥 만들어 보세요~</p>
	              <div class="d-flex justify-content-between align-items-center">
	                <div class="btn-group">
	                  <button type="button" onclick="location.href='https://www.youtube.com/watch?v=_O4tvQtZDiU'" class="btn btn-sm btn-outline-secondary">View</button>
	                  <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
	                </div>
	                <small class="text-muted">6 mins</small>
	              </div>
	            </div>
	          </div>
	        </div>
	        <div class="col-md-4">
	          <div class="card mb-4 shadow-sm">
	            <img alt="" src="img/cook3.png" class="youtube_img">
	            <div class="card-body">
	              <p class="card-text">쉽게 구할 수 있는 재료로 만든 김치볶음밥의 업그레이드 버전, 김치밥! 강식당2 속 그 메뉴, 직접 만들어보는 건 어떨까요?</p>
	              <div class="d-flex justify-content-between align-items-center">
	                <div class="btn-group">
	                  <button type="button" onclick="location.href='https://www.youtube.com/watch?v=R6IT_f0XPT8'" class="btn btn-sm btn-outline-secondary">View</button>
	                  <button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
	                </div>
	                <small class="text-muted">9 mins</small>
	              </div>
	            </div>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</main>
	</body>
</html>
