package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	// iv를 추가. 서블릿은 싱글톤이기 때문의 하나의 객체를 여러 쓰레드가 공유
	int count = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 입력
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		// 2. 작업
		
		// 3. 출력
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("    <meta charset='UTF-8'>");
		out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("    <title>Document</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("    <h1>id = " + id + "</h1>");
		out.println("    <h1>pwd = " + pwd + "</h1>");
		out.println("    <h1>COUNT = " + ++count + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
