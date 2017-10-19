package com.bsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/ABCHomePage")
public class ABCHomePage extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ABC公司主页</title>");
		out.println("</head>");
		out.println("<body>");
		ServletContext context=getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/servlet/HeaderServlet");
		rd.include(request, response);
//		rd.forward(request, response);
		out.println("<font size=4 color='#000099'>");
		out.println("&nbsp;&nbsp;ABC Limited founded in 1890 is a multinational "
				+ "company spread across six nations.<br><br>");
		out.println("We deal with garment export and online sales of designer wares.<br><br>");
		out.println("To have a look at our fascinating collection check out at "
				+ "<a href='www.abcdesign.com'>ABC Designs</a></font><br><br>");
		rd=context.getRequestDispatcher("/servlet/Footer.html");
		rd.include(request, response);
//		rd.forward(request, response);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
