<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//쿠키 가져오기
	Cookie[] cookies = request.getCookies(); // cookies가 null 수 있음에 주의
	String id = "";
	String remember = "";
	
	if(cookies != null) {
		for(int i=0;i<cookies.length;i++) {
	        if(cookies[i].getName().equals("id")) {
	        	id = cookies[i].getValue();	// 아이디 쿠키값 저장
	         	remember = "checked";		// 체크 박스 체크할 부분
	        }
  		}
	}
	
	// 권한 메세지 가져와 뿌리기
	String errMsg = request.getParameter("errMsg");
	if(errMsg !=null) {
    	out.println(
    		"<script> alert('"+ errMsg +"'); </script>"
    	);
    }
	
	// 메세지 가져와 뿌리기(아이디 비밀번호 틀렸을 때) 
   	String msg = request.getParameter("msg");
	msg = msg!=null? msg : "";
   
   String url = request.getParameter("url");

%> 

<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
   <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
   
   <link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
   <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
   <link rel="stylesheet" href="css/loginForm.css">
</head>
<body>
	<div class="container">
        <div class="row">
         <div class="col-md-5 mx-auto">
         <div id="first">
            <div class="myform form ">
                <div class="logo mb-3">
                   <div class="col-md-12 text-center">
                     <h1>Login</h1>
                   </div>
                  </div>
                <form action="/Session/LoginAction" method="post" name="login">
                	<div class="form-group">
                		<!-- 히든으로 board의 값(어느 게시판인지) 보내기 -->
                		<input type="hidden" name="url" value="<%=url%>">
                       	<label for="exampleInputEmail1">Id</label>
                        <input type="text" name="id" value="<%=id %>" class="form-control" id="id" placeholder="Enter id" required>
                      </div>
                    <div class="form-group">
                    	<label for="exampleInputEmail1">Password</label>
                        <input type="password" name="pwd" id="pwd"  class="form-control" placeholder="Enter Password" required>
                    </div>
                    <div class="custom-control custom-checkbox">
			        	<input type="checkbox" class="custom-control-input" id="save-info" <%=remember %> name="remember" value="remember">
			        	<label class="custom-control-label" for="save-info">Remember ID</label>
			        </div>
                    <div class="form-group">
                       <label id="msg"><%=msg %></label>
                       <p class="text-center">By signing up you accept our <a href="#">Terms Of Use</a></p>
                    </div>
                    <div class="col-md-12 text-center ">
                       <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">Login</button>
                    </div>
                    <div class="col-md-12 ">
                       <div class="login-or">
                          <hr class="hr-or">
                          <span class="span-or">or</span>
                       </div>
                    </div>
                    <div class="col-md-12 mb-3">
                       <p class="text-center">
                          <a href="javascript:void();" class="google btn mybtn"><i class="fa fa-google-plus">
                          </i> Signup using Google
                          </a>
                       </p>
                    </div>
                    <div class="form-group">
                       <p class="text-center">Don't have account? <a href="/Session/registerForm.jsp" id="signup">Sign up here</a></p>
                    </div>
               </form>
               </div>
            </div>
         </div>
      </div>
   </div>   
</body>
</html>