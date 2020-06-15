<%@page import="jdbc.UserDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<jsp:useBean id="user" class="jdbc.User" scope="request" />
<jsp:setProperty name="user" property="*"/>

<%
 	String id = request.getParameter("id"); 
	UserDao dao = UserDao.getInstance();
	user = dao.selectUser(id);
	
	boolean result = user!=null? true: false;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>아이디 중복 체크</title>

<style type="text/css">
	#wrap {
	    width: 490px;
	    text-align :center;
	    margin: 0 auto 0 auto;
	}
	
	#chk{
	    text-align :center;
	}
	
	#cancelBtn{
	    visibility:visible;
	}
	
	#useBtn{
	     visibility:hidden;
	}
	
	#msg {
		color : red;
	}
</style>
    
<script type="text/javascript">
      
	// 회원가입창의 아이디 입력란의 값을 가져온다.
	function pValue(){
	    document.getElementById("id").value = opener.document.regForm.id.value;
	}
	     
	// 아이디 중복체크
	function idCheck(){
		var id = document.getElementById("id").value;
			if(!id) {
				alert("아이디를 입력하지 않았습니다.");
		        return false;
			}else {
				callback();
			}
    } 
	     
     function callback(){
        if(<%=result %>){
            document.getElementById("cancelBtn").style.visibility='visible';
            document.getElementById("useBtn").style.visibility='hidden';
            document.getElementById("msg").innerHTML ="사용 할 수 없는 아이디입니다.";
        }else{ 
            document.getElementById("cancelBtn").style.visibility='hidden';
            document.getElementById("useBtn").style.visibility='visible';
            document.getElementById("msg").innerHTML = "사용 가능한 아이디입니다.";
        }
	}
	
	// 사용하기 클릭 시 부모창으로 값 전달 
	function sendCheckValue(){
	    // 중복체크 결과인 idCheck 값을 전달한다.
	    opener.document.regForm.result.value ="idCheck";
	    // 회원가입 화면의 ID입력란에 값을 전달
	    opener.document.regForm.id.value = document.getElementById("id").value;
	    
	    if (opener != null) {
	        opener.chkForm = null;
	        self.close();
	    }    
	}    
</script>
</head>

<body>
	<div id="wrap">
		<b>아이디 중복체크</b>
		<hr size="1" width="460">
		<br>
		<div id="chk">
			<form id="checkForm">
				<input type="text" name="idinput" id="id" value=<%=id %>>
				<input type="button" value="중복확인" onclick="idCheck()">
			</form>
			<div id="msg"></div>
			<br>
			<input id="cancelBtn" type="button" value="취소" onclick="window.close()"><br>
        	<input id="useBtn" type="button" value="사용하기" onclick="sendCheckValue()">
		</div>
	</div>
</body>
