package com.bsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException,IOException{
		
		String str1=(String) request.getAttribute("formRequest");
		HttpSession session=request.getSession();
		String str2=(String) session.getAttribute("fromSession");
		ServletContext context=request.getServletContext();
		String str3=(String) context.getAttribute("fromContext");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>输出范围属性有关信息</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H3>request值为："+str1+"</H3>");
		out.println("<H3>session值为："+str2+"</H3>");
		out.println("<H3>application值为："+str3+"</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}
}
