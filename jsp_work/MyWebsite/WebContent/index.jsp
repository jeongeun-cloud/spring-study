<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String id = request.getParameter("id");
%>
<!DOCTYPE html>
<html lang="en">
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
	body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
	.w3-bar,h1,button {font-family: "Montserrat", sans-serif}
	.fa-anchor,.fa-coffee {font-size:200px}
</style>
<body>

<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-red w3-card w3-left-align w3-large">
    <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-red" href="javascript:void(0);" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
    <a href="/" class="w3-bar-item w3-button w3-padding-large w3-white">홈</a>
    <a href="/loginForm.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">로그인</a>
    <a href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">로그아웃</a>
    <a href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">회원가입</a>
  </div>
</div>

<!-- Header -->
<header class="w3-container w3-red w3-center" style="padding:128px 16px">
  <h1 class="w3-margin w3-jumbo" id="start"><%=id %>님 환영합니다!</h1>
  <p class="w3-xlarge">Template by w3.css</p>
  <button class="w3-button w3-black w3-padding-large w3-large w3-margin-top">Get Started</button>
</header>

<script>
	// Used to toggle the menu on small screens when clicking on the menu button
	function myFunction() {
		var x = document.getElementById("navDemo");
		if (x.className.indexOf("w3-show") == -1) {
		  x.className += " w3-show";
		} else { 
		  x.className = x.className.replace(" w3-show", "");
		}
	}
</script>

</body>
</html>
