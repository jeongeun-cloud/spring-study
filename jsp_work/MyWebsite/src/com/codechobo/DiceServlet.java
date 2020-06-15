package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DiceServlet
 */
@WebServlet("/DiceServlet")
public class DiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		int i = (int)(Math.random()*6)+1;
		int j = (int)(Math.random()*6)+1;
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("    <meta charset='UTF-8'>");
		out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("    <title>Document</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("    <img src='E://jje_work/jsp_work/MyWebsite/src/com/codechobo/dice" + i + ".jpg'>");
		out.println("    <img src='E://jje_work/jsp_work/MyWebsite/src/com/codechobo/dice" + j + ".jpg'>");
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
