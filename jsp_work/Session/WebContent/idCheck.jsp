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
<title>���̵� �ߺ� üũ</title>

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
      
	// ȸ������â�� ���̵� �Է¶��� ���� �����´�.
	function pValue(){
	    document.getElementById("id").value = opener.document.regForm.id.value;
	}
	     
	// ���̵� �ߺ�üũ
	function idCheck(){
		var id = document.getElementById("id").value;
			if(!id) {
				alert("���̵� �Է����� �ʾҽ��ϴ�.");
		        return false;
			}else {
				callback();
			}
    } 
	     
     function callback(){
        if(<%=result %>){
            document.getElementById("cancelBtn").style.visibility='visible';
            document.getElementById("useBtn").style.visibility='hidden';
            document.getElementById("msg").innerHTML ="��� �� �� ���� ���̵��Դϴ�.";
        }else{ 
            document.getElementById("cancelBtn").style.visibility='hidden';
            document.getElementById("useBtn").style.visibility='visible';
            document.getElementById("msg").innerHTML = "��� ������ ���̵��Դϴ�.";
        }
	}
	
	// ����ϱ� Ŭ�� �� �θ�â���� �� ���� 
	function sendCheckValue(){
	    // �ߺ�üũ ����� idCheck ���� �����Ѵ�.
	    opener.document.regForm.result.value ="idCheck";
	    // ȸ������ ȭ���� ID�Է¶��� ���� ����
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
		<b>���̵� �ߺ�üũ</b>
		<hr size="1" width="460">
		<br>
		<div id="chk">
			<form id="checkForm">
				<input type="text" name="idinput" id="id" value=<%=id %>>
				<input type="button" value="�ߺ�Ȯ��" onclick="idCheck()">
			</form>
			<div id="msg"></div>
			<br>
			<input id="cancelBtn" type="button" value="���" onclick="window.close()"><br>
        	<input id="useBtn" type="button" value="����ϱ�" onclick="sendCheckValue()">
		</div>
	</div>
</body>