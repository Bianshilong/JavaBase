package com.bsl.servlet;
//浏览器重定向
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Redirect")
public class Redirect extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException,IOException{
		String location=request.getParameter("url");
		if (location==null) {
			response.sendRedirect("http://www.baidu.com");
//			response.setHeader("refresh", "3;URL=http://www.baidu.com");
		}else {
			response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
			response.setHeader("location", location);
		}
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException {
		doGet(request, response);
		
	}
}
