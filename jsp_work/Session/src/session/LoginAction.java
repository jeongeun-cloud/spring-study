package session;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
   private static final long serialVersionUID = 1L;
       

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String id = request.getParameter("id");
      String pwd = request.getParameter("pwd");
      String url = request.getParameter("url");
      String remember = request.getParameter("remember");
      
      if(url.equals("null")) url = "/Session/index.jsp";	
      
      String msg = "id 또는 비밀번호가 일치하지 않습니다.";

      msg = URLEncoder.encode(msg, "utf-8");
     
      // id와 pwd가 일치하지 않는 경우
      if(!loginCheck(id,pwd)) {
    	  url = "/Session/loginForm.jsp?msg="+msg;
      } else {
    	  // 기억하기의 값이 있으면 (체크되어 있으면)
    	  if(remember != null) {
  		  	// 쿠키생성
				Cookie cookie = new Cookie("id", id);
				response.addCookie(cookie);
			}else {
				// 쿠키 삭제
				Cookie cookie = removeCookie(request.getCookies(), id);
				if(cookie != null) {
					response.addCookie(cookie);
				}
			}
	  	  // 세션 생성
	  	  HttpSession session = request.getSession();
	  	  session.setAttribute("id", id);
      }
      // 받아온 url 값으로 url이동
      response.sendRedirect(url);
   }
   
   
   // 쿠키삭제 메서드
   protected Cookie removeCookie(Cookie[] cookies, String id) {
		if(cookies!=null) {
			for(int i=0;i<cookies.length;i++) {
              if(cookies[i].getName().equals("id")) {
           	    Cookie cookie = new Cookie("id", ""); 
           	    cookie.setMaxAge(0); 
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
      doGet(request, response);
   }

}