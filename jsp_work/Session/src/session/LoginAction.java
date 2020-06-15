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
      
      String msg = "id �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.";

      msg = URLEncoder.encode(msg, "utf-8");
     
      // id�� pwd�� ��ġ���� �ʴ� ���
      if(!loginCheck(id,pwd)) {
    	  url = "/Session/loginForm.jsp?msg="+msg;
      } else {
    	  // ����ϱ��� ���� ������ (üũ�Ǿ� ������)
    	  if(remember != null) {
  		  	// ��Ű����
				Cookie cookie = new Cookie("id", id);
				response.addCookie(cookie);
			}else {
				// ��Ű ����
				Cookie cookie = removeCookie(request.getCookies(), id);
				if(cookie != null) {
					response.addCookie(cookie);
				}
			}
	  	  // ���� ����
	  	  HttpSession session = request.getSession();
	  	  session.setAttribute("id", id);
      }
      // �޾ƿ� url ������ url�̵�
      response.sendRedirect(url);
   }
   
   
   // ��Ű���� �޼���
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
   
   // id, pwd üũ�ϴ� �޼���
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