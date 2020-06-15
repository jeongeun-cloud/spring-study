<%@page import="java.util.regex.Pattern"%>
<%@page import="jdbc.User"%>
<%@page import="jdbc.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="user" class="jdbc.User" scope="request" />
<jsp:setProperty name="user" property="*"/>


<%
	// 서버단 유효성 체크
	String msg = "";
	
	// id관련
	if(user.getId().length() <4 || user.getId().length() >12) {
		// 아이디 길이 오류
		msg = "아이디는 4~12자 사이로 입력해주세요.";
	}

	// pwd
	if(user.getPwd().length() <8) {
		// pwd 길이오류
		msg = "패스워드는 8자 이상이어야 하며, 숫자/영문자/특수문자를 모두 포함해야 합니다.";
	}
	
	// email, name 
	if(user.getEmail().length() <1 || user.getName().length() < 1) {
		// not null
		msg = "유효하지 않은 이메일입니다";
	}
	
 	UserDao dao = UserDao.getInstance();
	int cnt = dao.insertUser(user);
	
	if(cnt != 1) {
		// 에러!
		// 1. 페이지 포워드 - 레지폼으로
		// 2. 레지폼에서 useBean으로 값 가져와서
		// 3. 다시 되있던 값 벨류로 뿌려주기
		out.println("<script>alert('입력이 실패했습니다.');</script>");
		request.getRequestDispatcher("registerForm.jsp?msg="+msg).forward(request, response);
	}
 %>

<jsp:forward page="userInfo.jsp"></jsp:forward>