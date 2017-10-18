package com.bsl.servlet;
//向浏览器发送错误信息
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SendError")
public class SendError extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException,IOException{
		
		response.sendError(HttpServletResponse.SC_GONE,"Resource no longer available");
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException {
		doGet(request, response);
		
	}
}
