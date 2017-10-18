package com.bsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("all")
//@WebServlet("/servlet/ServletDemo1")
public class ServletDemo1 extends HttpServlet{
	
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<H2>我们正在学习Servlet编程</H2>");
		out.println("<H3>现在的时间是："+new Date()+"</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
		
	}
}

