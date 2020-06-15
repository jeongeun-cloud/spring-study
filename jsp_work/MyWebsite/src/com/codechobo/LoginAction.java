package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 입력
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String remember = request.getParameter("remember");
		String targetUrl = "";
		String msg = "id 또는 비밀번호가 일치하지 않습니다.";

		msg = URLEncoder.encode(msg, "utf-8");
		
		// 2. 작업
		// id와 pwd가 일치하는 경우
		if(loginCheck(id, pwd)) {
			
			// remember의 값이 있으면 (체크박스가 체크되어 있으면)
			if(remember != null) {
				// 쿠키 생성
				Cookie cookie = new Cookie("id", id);
				response.addCookie(cookie);
			}else {
				// 쿠키 삭제
				Cookie cookie = removeCookie(request.getCookies(), id);
				if(cookie != null) {
					response.addCookie(cookie);
				}
			}
			
			targetUrl = "/index.jsp?id="+id;
			response.sendRedirect(targetUrl);
			
		} else{
			// id와 pwd가 일치하지 않는 경우
			targetUrl = "/loginForm.jsp?msg="+msg;
			response.sendRedirect(targetUrl);
		}
	}
	
	// 쿠키 삭제하는 메서드
	protected Cookie removeCookie(Cookie[] cookies, String id) {
		if(cookies!=null) {
			for(int i=0;i<cookies.length;i++) {
               if(cookies[i].getName().equals("id")) {
            	    Cookie cookie = new Cookie("id", ""); // 2. 쿠키를 생성
            	    cookie.setMaxAge(0); // 3. 쿠키의 유효시간을 0으로 변경(쿠키삭제)
                    return cookie;
                }
	       	}
		}
		return null;
	}
	
	// id, pwd 체크하는 메서드
	protected boolean loginCheck(String id, String pwd) {
		if(id.equals("asdf") && pwd.equals("1234")) {
			return true;
		}
		return false;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);	// 자신이 받은 요청을 doGet()에게 넘긴다.
	}

}
