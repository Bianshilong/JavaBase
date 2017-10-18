package com.bsl.servlet;
//表单登录，测试get和post方法
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
@SuppressWarnings("all")
@WebServlet("/servlet/MyLoginServletDemo")

public class MyLoginServletDemo extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
//		//设置生成的文档类型
//		response.setContentType("text/html;charset=UTF-8");
//		//得到输出字符输出流
//		PrintWriter out=response.getWriter();
//		//输出相应的HTML文件
//		out.println("<HTML>");
//		out.println("<HEAD><Title>测试get和post方法</Title></HEAD>");
//		out.println("<BODY>");
//		out.println("<H2>调用了doGet()方法</H2>");
//		out.println("<H2>用户输入信息如下：</H2>");
//		String username=request.getParameter("username");
//		if (username=="" || username==null) {
//			username="未输入";
//		}
//		String passwd=request.getParameter("password");
//		if (passwd==null || passwd=="") {
//			passwd="未输入";
//		}
//		out.println("<H2>用户名："+username+"</H2>");
//		//可以测试空格能否输出
//		out.println("<H2>密　码："+passwd+"</H2>");
//		out.println("</BODY>");
//		out.println("</HTML");
//		out.close();
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		
		//设置生成的文档类型
		response.setContentType("text/html;charset=UTF-8");
		//得到输出字符输出流
		PrintWriter out=response.getWriter();
		//输出相应的HTML文件
		out.println("<HTML>");
		out.println("<HEAD><Title>测试get和post方法</Title></HEAD>");
		out.println("<BODY>");
		out.println("<H2>调用了doPost()方法</H2>");
		out.println("<H2>用户输入信息如下：</H2>");
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		if (username=="" || username==null) {
			username="未输入";
		}
		String passwd=request.getParameter("password");
		if (passwd==null || passwd=="") {
			passwd="未输入";
		}
		out.println("<TABLE border='1'>");
		//out.println("<H2>用户名:"+username+"</H2>");
		//可以测试空格能否输出,经测试，可以输出
		//out.println("<H2>密　码："+passwd+"</H2>");
		out.println("<TR><TD>用户名</TD><TD>"+username+"</TD></TR>");
		out.println("<TR><TD>密　码</TD><TD>"+passwd+"</TD></TR>");
		/*out.println("<tr>");
		out.print("<td>");
		out.print("用户名");
		out.println("</td>");
		out.print("<td>");
		out.print(username);
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.print("<td>");
		out.print("密码");
		out.println("</td>");
		out.print("<td>");
		out.print(passwd);
		out.println("</td>");
		out.println("</tr>");*/
		out.println("</TABLE>");
		out.println("</BODY>");
		out.println("</HTML");
		out.close();
	}
}