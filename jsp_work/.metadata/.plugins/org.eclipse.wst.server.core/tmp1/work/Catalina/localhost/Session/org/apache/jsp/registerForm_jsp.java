/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.55
 * Generated at: 2020-06-08 04:12:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      jdbc.User user = null;
      user = (jdbc.User) _jspx_page_context.getAttribute("user", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (user == null){
        user = new jdbc.User();
        _jspx_page_context.setAttribute("user", user, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("user"), request);
      out.write("\r\n");
      out.write("\r\n");

	String result = request.getParameter("result"); 
	System.out.println(result);
    	out.println(
    		"<script> history.replaceState({},null, location.pathname); </script>"
    	);
    	
	String id = user.getId() == null? "" : user.getId();
	String name = user.getName() == null? "" : user.getName();
	String email = user.getEmail() == null? "" : user.getEmail();
	
	String msg = request.getParameter("msg");

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Signup Page</title>\r\n");
      out.write("   <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("   <link href=\"https://fonts.googleapis.com/css?family=Kaushan+Script\" rel=\"stylesheet\">\r\n");
      out.write("   <style>\r\n");
      out.write("   body {\r\n");
      out.write("\t    padding-top:4.2rem;\r\n");
      out.write("\t\tpadding-bottom:4.2rem;\r\n");
      out.write("\t\tbackground:rgba(0, 0, 0, 0.76);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("   \th1,h2,h3 {\r\n");
      out.write("     \tfont-family: 'Kaushan Script', cursive;\r\n");
      out.write("\t}\r\n");
      out.write("\t  \r\n");
      out.write("\t.myform {\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t\tdisplay: -ms-flexbox;\r\n");
      out.write("\t\tdisplay: flex;\r\n");
      out.write("\t\tpadding: 1rem;\r\n");
      out.write("\t\t-ms-flex-direction: column;\r\n");
      out.write("\t\tflex-direction: column;\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\tpointer-events: auto;\r\n");
      out.write("\t\tbackground-color: #fff;\r\n");
      out.write("\t\tbackground-clip: padding-box;\r\n");
      out.write("\t\tborder: 1px solid rgba(0,0,0,.2);\r\n");
      out.write("\t\tborder-radius: 1.1rem;\r\n");
      out.write("\t\toutline: 0;\r\n");
      out.write("\t\tmax-width: 500px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.tx-tfm {\r\n");
      out.write("\t    text-transform:uppercase;\r\n");
      out.write("\t}\r\n");
      out.write("\t.mybtn {\r\n");
      out.write("\t    border-radius:50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#pwdMsg {\r\n");
      out.write("\t\tfont-size:12px;\r\n");
      out.write("\t\topacity:0.8;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("   </style>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tif(");
      out.print(msg );
      out.write(" != null) {\r\n");
      out.write("\t\t\talert(");
      out.print(msg );
      out.write(");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("         <div class=\"col-md-5 mx-auto\">\r\n");
      out.write("         <div id=\"first\">\r\n");
      out.write("            <div class=\"myform form \">\r\n");
      out.write("                <div class=\"logo mb-3\">\r\n");
      out.write("                   <div class=\"col-md-12 text-center\">\r\n");
      out.write("                     <h1>Sign up</h1>\r\n");
      out.write("                   </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("\t\t\t\t<!-- <form action=\"registerAction.jsp\" method=\"POST\"> -->\r\n");
      out.write("\t\t\t\t<form action=\"registerAction.jsp\" name=\"regForm\" id=\"regForm\" method=\"POST\" onsubmit=\"return checkValue()\">\r\n");
      out.write("\t\t\t        <div class=\"row\">\r\n");
      out.write("\t\t \t\t       \t<div class=\"col-md-8 mb-3\">\r\n");
      out.write("\t\t\t\t            <label for=\"id\">UserID</label>\r\n");
      out.write("\t\t\t\t            <input type=\"text\" class=\"form-control\" name=\"id\" id=\"id\" value=\"");
      out.print(id );
      out.write("\" placeholder=\"UserID\" required>\r\n");
      out.write("\t\t\t\t            <div class=\"invalid-feedback\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t              Your userID is required.\r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        <div class=\"col-md-4 mb-3\">\r\n");
      out.write("\t\t\t\t        \t<label for=\"id\"><br></label>\r\n");
      out.write("\t\t\t          \t\t<input type=\"button\" onclick=\"checkId()\" class=\"btn btn-block btn-primary tx-tfm\" name=\"idCheck\" id=\"idCheck\" value=\"ID Check\">\r\n");
      out.write("\t\t\t\t            <input type=\"hidden\" name=\"result\" id=\"result\" value=\"");
      out.print(result );
      out.write("\">\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t        <div class=\"mb-3\">\r\n");
      out.write("\t\t\t          <label for=\"name\">Name </label>\r\n");
      out.write("\t\t\t          <input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" value=\"");
      out.print(name );
      out.write("\" placeholder=\"Name\" required>\r\n");
      out.write("\t\t\t          <div class=\"invalid-feedback\">\r\n");
      out.write("\t\t\t            Please enter a valid email address for updates.\r\n");
      out.write("\t\t\t          </div>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t        <div class=\"mb-3\">\r\n");
      out.write("\t\t\t          <label for=\"email\">Email </label>\r\n");
      out.write("\t\t\t          <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" value=\"");
      out.print(email );
      out.write("\" placeholder=\"you@example.com\" required>\r\n");
      out.write("\t\t\t          <div class=\"invalid-feedback\">\r\n");
      out.write("\t\t\t            Please enter a valid email address for updates.\r\n");
      out.write("\t\t\t          </div>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t        <div class=\"mb-3\">\r\n");
      out.write("\t\t\t          <label for=\"password\">Password</label>\r\n");
      out.write("\t\t\t          <label id=\"pwdMsg\">(8자리 이상의 문자, 숫자, 특수문자 포함)</label>\r\n");
      out.write("\t\t\t          <input type=\"password\" class=\"form-control\" name=\"pwd\" id=\"pwd\" placeholder=\"Enter Password\" required>\r\n");
      out.write("\t\t\t          <label id=\"regPwd\"></label>\r\n");
      out.write("\t\t\t          <div class=\"invalid-feedback\">\r\n");
      out.write("\t\t\t            Please enter your Password\r\n");
      out.write("\t\t\t          </div>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t        <div class=\"mb-3\">\r\n");
      out.write("\t\t\t          <label for=\"passwordCheck\">Confirm Password</label>\r\n");
      out.write("\t\t\t          <input type=\"password\" class=\"form-control\" id=\"pwdCheck\" placeholder=\"Confirm Password\" required>\r\n");
      out.write("\t\t\t          <div class=\"invalid-feedback\">\r\n");
      out.write("\t\t\t            Please enter your Password Confirm\r\n");
      out.write("\t\t\t          </div>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t        <div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t        <div class=\"alert alert-success\" id=\"alert-success\">비밀번호가 일치합니다.</div> \r\n");
      out.write("\t\t\t\t        <div class=\"alert alert-danger\" id=\"alert-danger\">비밀번호가 일치하지 않습니다.</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t        <div class=\"col-md-12 text-center\" style=\"padding:30px 0 10px 0;\">\r\n");
      out.write("                    \t<button type=\"submit\" class=\" btn btn-block mybtn btn-primary tx-tfm\">Sign Up</button>\r\n");
      out.write("                   \t</div>\r\n");
      out.write("                   \t<div class=\"col-md-12 text-center\" style=\"padding:20px 0 10px 0;\">\r\n");
      out.write("                      \t<button onclick=\"location.href='/Session/loginForm.jsp'\" class=\" btn btn-block mybtn tx-tfm\">로그인하기</button>\r\n");
      out.write("                   \t</div>\r\n");
      out.write("                   \t<div class=\"col-md-12 text-center\" style=\"padding:20px 0 10px 0;\">\r\n");
      out.write("                      \t<button onclick=\"location.href='/Session/index.jsp'\" class=\" btn btn-block mybtn tx-tfm\">홈으로</button>\r\n");
      out.write("                   \t</div>\r\n");
      out.write("              \t</form>\r\n");
      out.write("              </div>\r\n");
      out.write("           </div>\r\n");
      out.write("        </div>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   \t<script src=\"https://code.jquery.com/jquery-3.5.1.js\" integrity=\"sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("   \t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t   $(function() {\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t\t$(\"#alert-success\").hide();\r\n");
      out.write("\t\t\t$(\"#alert-danger\").hide();\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"input\").keyup(function() {\r\n");
      out.write("\t\t\t\tvar pwd1 = $(\"#pwd\").val();\r\n");
      out.write("\t\t\t\tvar pwd2 = $(\"#pwdCheck\").val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (pwd1 != \"\" || pwd2 != \"\") {\r\n");
      out.write("\t\t\t\t\tif (pwd1 == pwd2) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#alert-success\").show();\r\n");
      out.write("\t\t\t\t\t\t$(\"#alert-danger\").hide();\r\n");
      out.write("\t\t\t\t\t\t$(\"#submit\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$(\"#alert-success\").hide();\r\n");
      out.write("\t\t\t\t\t\t$(\"#alert-danger\").show();\r\n");
      out.write("\t\t\t\t\t\t$(\"#submit\").attr(\"disabled\", \"disabled\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction checkValue() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar regEmail = /^[\\w-]{4,}@[\\w-]+(\\.\\w+){1,3}$/; \r\n");
      out.write("\t\t\tvar regPwd = /^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$/;\r\n");
      out.write("\t\t\tvar email = document.getElementById(\"email\").value;\r\n");
      out.write("\t\t\tvar pwd = document.getElementById(\"pwd\").value; \r\n");
      out.write("\t\t\tvar id = document.getElementById(\"id\").value;\r\n");
      out.write("\t\t\tvar idCheck = document.getElementById(\"result\").value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(idCheck == \"null\") {\r\n");
      out.write("\t\t\t\talert(\"아이디 중복체크를 해주세요!\");\r\n");
      out.write("\t\t\t\tdocument.regForm.id.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else if(!regEmail.test(email)){\r\n");
      out.write("\t\t\t\talert(\"유효하지 않은 이메일입니다\");\r\n");
      out.write("\t\t\t\tdocument.regForm.email.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else if(!regPwd.test(pwd)){\r\n");
      out.write("\t\t\t\talert('비밀번호는 8자 이상이어야 하며, 숫자/영문자/특수문자를 모두 포함해야 합니다.');\r\n");
      out.write("\t\t\t\tdocument.regForm.pwd.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t \t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction checkId() {\r\n");
      out.write("\t\t\tvar id = document.getElementById(\"id\").value;\r\n");
      out.write(" \t\t \tvar url = \"idCheck.jsp?id=\"+ id;\r\n");
      out.write("\t\t\t/* var option = \"width = 500, height = 500, top = 100, left = 200, location = no\" */\r\n");
      out.write("\r\n");
      out.write("\t\t\tif(id == \"\") {\r\n");
      out.write("\t\t\t\talert(\"아이디를 입력해주세요!\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else if(id.length<4 || id.length>12) {\r\n");
      out.write("\t\t\t\talert(\"아이디는 4~12자 사이로 입력해주세요.\");\r\n");
      out.write("\t\t\t\tdocument.regForm.id.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\twindow.open(url, \"\",\"width=500, height=300, resizable=no, scrollbars =no\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("/*    \t\t\t$.ajax({\r\n");
      out.write("\t\t        type:\"post\",\r\n");
      out.write("\t\t        url:\"idCheck.jsp\",\r\n");
      out.write("\t\t        async:true,\r\n");
      out.write("\t\t        data:\"id=\" + id,\r\n");
      out.write("\t\t        success : function(data){\r\n");
      out.write("\t\t\t\t\talert(result.id);\r\n");
      out.write("\t\t        \tif(user != null) {\r\n");
      out.write("\t\t\t            alert(\"이미 존재하는 아이디 입니다.\");\r\n");
      out.write("\t\t        \t}else {\r\n");
      out.write("\t\t        \t\talert(\"사용 가능한 아이디 입니다.\");\r\n");
      out.write("\t\t        \t}\r\n");
      out.write("\t\t        \tlocation.href=\"\";\r\n");
      out.write("\t\t        },\r\n");
      out.write("\t\t         error : function(){\r\n");
      out.write("\t\t            alert(\"ajax error\");\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    });   */\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}