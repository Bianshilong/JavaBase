package com.bsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/LoginDemo")
public class LoginDemo extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<head><title>登录页面</title></head>");
		out.println("<body>");
		out.println("<h3>请输入用户信息:</h3>");
		out.println("<form method='post' action='EnterDemo'>");
		out.println("用户名：<input type='text' name='username' /><br/>");
		out.println("密　码：<input type='password' name='password' /><br/>");
		out.println("<input type='submit' value='提交' /> &nbsp;&nbsp;<input type='reset' value='重置' />");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request, response);
	}
}
