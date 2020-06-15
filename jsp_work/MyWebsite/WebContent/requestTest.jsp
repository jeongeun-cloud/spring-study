<%@ page contentType = "text/html; charset=utf-8" %>
<html>
<head>
<title>request의 메서드</title>
</head>
<body>
	
	request.getRemoteAddr()        =<%= request.getRemoteAddr() %> <br>
	request.getContentLength()     =<%= request.getContentLength() %> <br>
	request.getCharacterEncoding() =<%= request.getCharacterEncoding() %> <br>
	request.getContentType() =<%= request.getContentType() %> <br>
	request.getProtocol() =<%= request.getProtocol() %> <br>
	request.getMethod() =<%= request.getMethod() %> <br>
	request.getQueryString() =<%= request.getQueryString() %> <br>
	request.getRequestURI() =<%= request.getRequestURI() %> <br>
	request.getRequestURL() =<%= request.getRequestURL() %> <br>
	request.getContextPath() =<%= request.getContextPath() %> <br>
	request.getServletPath() =<%= request.getServletPath() %> <br>
	request.getServerName() =<%= request.getServerName() %> <br>
	request.getServerPort() =<%= request.getServerPort() %> <br>

</body>

</html>