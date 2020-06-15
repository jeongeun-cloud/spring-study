<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="user" class="jdbc.User" scope="request" />
<jsp:setProperty name="user" property="*"/>

<%
	String result = request.getParameter("result"); 
	System.out.println(result);
    	out.println(
    		"<script> history.replaceState({},null, location.pathname); </script>"
    	);
    	
	String id = user.getId() == null? "" : user.getId();
	String name = user.getName() == null? "" : user.getName();
	String email = user.getEmail() == null? "" : user.getEmail();
	
	String msg = request.getParameter("msg");
%>
    
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Signup Page</title>
   <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
   <link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
   <style>
   body {
	    padding-top:4.2rem;
		padding-bottom:4.2rem;
		background:rgba(0, 0, 0, 0.76);
	}

   	h1,h2,h3 {
     	font-family: 'Kaushan Script', cursive;
	}
	  
	.myform {
		position: relative;
		display: -ms-flexbox;
		display: flex;
		padding: 1rem;
		-ms-flex-direction: column;
		flex-direction: column;
		width: 100%;
		pointer-events: auto;
		background-color: #fff;
		background-clip: padding-box;
		border: 1px solid rgba(0,0,0,.2);
		border-radius: 1.1rem;
		outline: 0;
		max-width: 500px;
	}
	.tx-tfm {
	    text-transform:uppercase;
	}
	.mybtn {
	    border-radius:50px;
	}
	
	#pwdMsg {
		font-size:12px;
		opacity:0.8;
	}
	
   </style>
	<script>
		if(<%=msg %> != null) {
			alert(<%=msg %>);
		}
	</script>
</head>
<body>
	<div class="container">
         <div class="col-md-5 mx-auto">
         <div id="first">
            <div class="myform form ">
                <div class="logo mb-3">
                   <div class="col-md-12 text-center">
                     <h1>Sign up</h1>
                   </div>
                  </div>
                  
				<!-- <form action="registerAction.jsp" method="POST"> -->
				<form action="registerAction.jsp" name="regForm" id="regForm" method="POST" onsubmit="return checkValue()">
			        <div class="row">
		 		       	<div class="col-md-8 mb-3">
				            <label for="id">UserID</label>
				            <input type="text" class="form-control" name="id" id="id" value="<%=id %>" placeholder="UserID" required>
				            <div class="invalid-feedback" style="width: 100%;">
				              Your userID is required.
				            </div>
			            </div>
				        <div class="col-md-4 mb-3">
				        	<label for="id"><br></label>
			          		<input type="button" onclick="checkId()" class="btn btn-block btn-primary tx-tfm" name="idCheck" id="idCheck" value="ID Check">
				            <input type="hidden" name="result" id="result" value="<%=result %>">
				        </div>
			        </div>
			        
			        <div class="mb-3">
			          <label for="name">Name </label>
			          <input type="text" class="form-control" name="name" id="name" value="<%=name %>" placeholder="Name" required>
			          <div class="invalid-feedback">
			            Please enter a valid email address for updates.
			          </div>
			        </div>
			
			        <div class="mb-3">
			          <label for="email">Email </label>
			          <input type="email" class="form-control" name="email" id="email" value="<%=email %>" placeholder="you@example.com" required>
			          <div class="invalid-feedback">
			            Please enter a valid email address for updates.
			          </div>
			        </div>
			
			        <div class="mb-3">
			          <label for="password">Password</label>
			          <label id="pwdMsg">(8자리 이상의 문자, 숫자, 특수문자 포함)</label>
			          <input type="password" class="form-control" name="pwd" id="pwd" placeholder="Enter Password" required>
			          <label id="regPwd"></label>
			          <div class="invalid-feedback">
			            Please enter your Password
			          </div>
			        </div>
			
			        <div class="mb-3">
			          <label for="passwordCheck">Confirm Password</label>
			          <input type="password" class="form-control" id="pwdCheck" placeholder="Confirm Password" required>
			          <div class="invalid-feedback">
			            Please enter your Password Confirm
			          </div>
			        </div>
			        
			        <div class="mb-3">
				        <div class="alert alert-success" id="alert-success">비밀번호가 일치합니다.</div> 
				        <div class="alert alert-danger" id="alert-danger">비밀번호가 일치하지 않습니다.</div>
					</div>
			        
			        <div class="col-md-12 text-center" style="padding:30px 0 10px 0;">
                    	<button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">Sign Up</button>
                   	</div>
                   	<div class="col-md-12 text-center" style="padding:20px 0 10px 0;">
                      	<button onclick="location.href='/Session/loginForm.jsp'" class=" btn btn-block mybtn tx-tfm">로그인하기</button>
                   	</div>
                   	<div class="col-md-12 text-center" style="padding:20px 0 10px 0;">
                      	<button onclick="location.href='/Session/index.jsp'" class=" btn btn-block mybtn tx-tfm">홈으로</button>
                   	</div>
              	</form>
              </div>
           </div>
        </div>
   </div>

   	<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
   	<script type="text/javascript">

	   $(function() {
		   
			$("#alert-success").hide();
			$("#alert-danger").hide();

			$("input").keyup(function() {
				var pwd1 = $("#pwd").val();
				var pwd2 = $("#pwdCheck").val();
				
				if (pwd1 != "" || pwd2 != "") {
					if (pwd1 == pwd2) {
						$("#alert-success").show();
						$("#alert-danger").hide();
						$("#submit").removeAttr("disabled");
					} else {
						$("#alert-success").hide();
						$("#alert-danger").show();
						$("#submit").attr("disabled", "disabled");
					}
				}
			});
			
		});
	</script>
	
	<script>
		function checkValue() {
			
			var regEmail = /^[\w-]{4,}@[\w-]+(\.\w+){1,3}$/; 
			var regPwd = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,}$/;
			var email = document.getElementById("email").value;
			var pwd = document.getElementById("pwd").value; 
			var id = document.getElementById("id").value;
			var idCheck = document.getElementById("result").value;
			
			if(idCheck == "null") {
				alert("아이디 중복체크를 해주세요!");
				document.regForm.id.focus();
				return false;
			}else if(!regEmail.test(email)){
				alert("유효하지 않은 이메일입니다");
				document.regForm.email.focus();
				return false;
			}else if(!regPwd.test(pwd)){
				alert('비밀번호는 8자 이상이어야 하며, 숫자/영문자/특수문자를 모두 포함해야 합니다.');
				document.regForm.pwd.focus();
				return false;
			}
			return true;
	 	}
		
		function checkId() {
			var id = document.getElementById("id").value;
 		 	var url = "idCheck.jsp?id="+ id;
			/* var option = "width = 500, height = 500, top = 100, left = 200, location = no" */

			if(id == "") {
				alert("아이디를 입력해주세요!");
				return false;
			}else if(id.length<4 || id.length>12) {
				alert("아이디는 4~12자 사이로 입력해주세요.");
				document.regForm.id.focus();
				return false;
			}
			window.open(url, "","width=500, height=300, resizable=no, scrollbars =no");
		}

/*    			$.ajax({
		        type:"post",
		        url:"idCheck.jsp",
		        async:true,
		        data:"id=" + id,
		        success : function(data){
					alert(result.id);
		        	if(user != null) {
			            alert("이미 존재하는 아이디 입니다.");
		        	}else {
		        		alert("사용 가능한 아이디 입니다.");
		        	}
		        	location.href="";
		        },
		         error : function(){
		            alert("ajax error");
		        }
		    });   */
	</script>
	
</body>
</html>