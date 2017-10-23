package com.bsl.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet/EnterDemo")
public class EnterDemo extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException,IOException{
		
		response.setContentType("text/html;charset=UTF-8");    //设置当前页面的输出文档类型，及字符集
		String name=request.getParameter("username");
		String pws=request.getParameter("password");
		if ("zhangsan".equals(name) && "123456".equals(pws)) {
			HttpSession hsession = request.getSession();
			hsession.setAttribute("username", name);      //设置当前页面的登录保留信息
			response.sendRedirect("/MyJavaWeb/servlet/Welcome.html");
			//跳转值登录成功页面
//			ServletContext context =getServletContext();
//			RequestDispatcher rd = context.getRequestDispatcher("/servlet/Welcome.html");
//			rd.forward(request, response);
		}else {
			//google浏览器跳转页面出现乱码，放在ie浏览器可正常显示，可以在LoginDemo的<html>标签后加入<meta charset=\"UTF-8\">
			RequestDispatcher rd = request.getRequestDispatcher("/servlet/LoginDemo");
			rd.include(request, response);
		}
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		doPost(request, response);
	}
}
