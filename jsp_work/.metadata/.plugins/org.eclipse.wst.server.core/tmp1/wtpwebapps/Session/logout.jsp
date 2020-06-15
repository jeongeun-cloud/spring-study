<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>

<%--
	//세션, 스크립트 이용한 로그아웃
   	out.println("<script> alert('로그아웃 되었습니다!');	location.href='/Session/index.jsp';	</script>");
   	session.invalidate(); 

--%>
 		
<%
	// 세션 삭제
	session.invalidate(); 
	
	// 리다이렉트로 로그아웃 메세지 보내기
	String logoutMsg = "로그아웃 되었습니다!";
	logoutMsg = URLEncoder.encode(logoutMsg, "utf-8");
   	response.sendRedirect("/Session/index.jsp?logoutMsg="+logoutMsg);
   	
%>
