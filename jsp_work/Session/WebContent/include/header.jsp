<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 세션으로 확인 할 때
	String id = (String)session.getAttribute("id");
	
	// 세션(id)가 비어 있으면
	String logChk = id==null? "Login" : "Logout" ;
	String src = id==null? "/Session/loginForm.jsp" : "/Session/logout.jsp"; 
 	String show = id==null? "" : "none"; 
	
%>

<!doctype html>
<html lang="en">
  <head>

    <!-- Bootstrap and CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

    <style>
    /* Show it is fixed to the top */
	body {
	  min-height: 75rem;
	  padding-top: 4.5rem;
	}
	
	.navbar-brand {
		background-color: unset;
		box-shadow: none;
	}
    
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
      
      a, a:hover{
      	color:#fff;
      	text-decoration: none;
      }
      
      #sign-up{
      	margin-left:10px;
      }
      
    </style>

  </head>
  <body>
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
	  <a class="navbar-brand" href="/Session/index.jsp">HOME</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarCollapse">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item">
	        <a class="nav-link active" href="/Session/board.jsp">Board</a>
	      </li>
	      <li class="nav-item active">
	        <a class="nav-link" href="/Session/lecture.jsp">Lecture</a>
	      </li>
	    </ul>
	    <a class="nav-login" href="<%=src %>"><%=logChk %></a>
	    <%-- <a class="nav-login" id="sign-up" style="display:<%=show %>;" href="/Session/signupForm.jsp">Sign Up</a> --%>
	  </div>
	</nav>
   </body>
   
</html>
