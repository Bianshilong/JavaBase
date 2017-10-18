package com.bsl.servlet;

//解决中文乱码问题
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestCoding")
public class TestCoding extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException,IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		//解决中文乱码问题，方式一，获取前设置编码方式
//		request.setCharacterEncoding("UTF-8");
		String str=request.getParameter("info");
		//解决中文乱码问题，方式二，将获取到的值，按服务器的编码方式转换称字符数组，再按我们需要的编码方式转换称字符串
//		String neStr=new String(str.getBytes("iso-8859-1"),"utf-8");
//		String pwd=request.getParameter("passwd");
		PrintWriter out=response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
//		out.println("<H3>账户名为："+neStr+"</H3>");
		out.println("<H3>账户名为："+str+"</H3>");
//		out.println("<H3>密　码为："+pwd+"</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
			
			doGet(request, response);
		}
}
