package com.bsl.servlet;

//输出报头有关信息
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OutputIofo
 */
@WebServlet("/OutputIofo")
public class OutputIofo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>输出报头有关信息</HEAD>");
		out.println("<BODY>");
		Enumeration headers=request.getHeaderNames();
		while (headers.hasMoreElements()) {
			String name = (String) headers.nextElement();
			String value=request.getHeader(name);
			out.println("<H3>"+name+":"+value+"</H3>");
		}
		out.println("<H3>客户端IP地址为："+request.getRemoteAddr()+"</H3>");
		out.println("<H3>客户端的端口号为："+request.getRemotePort()+"</H3>");
		out.println("<H3>客户端的主机为："+request.getRemoteHost()+"</H3>");
		out.println("<H3>客户端的用户为："+request.getRemoteUser()+"</H3>");
		out.println("<H3>服务器的IP地址："+request.getLocalAddr()+"</H3>");
		out.println("<H3>服务器的端口号："+request.getLocalPort()+"</H3>");
		out.println("<H3>服务器的语言"+request.getLocale()+"</H3>");
		out.println("<H3>服务器的名称："+request.getLocalName()+"</H3>");
		
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}

}
