package com.bsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParameter
 */
//初始化变量
//@WebServlet(description = "init Parameter", urlPatterns = { "/InitParameter" })
public class InitParameter extends HttpServlet {
	
	private String mycollege=null;
	private String mycourse=null;
	private int count=0;
	
	public void init(ServletConfig config) 
			throws ServletException{
		
		super.init(config);
		mycollege=config.getInitParameter("college");
		if (mycollege==null) {
			mycollege="";
		}
		mycourse=config.getInitParameter("course");
		if (mycourse==null) {
			mycourse="";
		}
		String strcount=config.getInitParameter("count");
		try {
			count=Integer.parseInt(strcount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ServletContext sc=config.getServletContext();
		
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>获得初始化参数</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H3>所在学校："+mycollege+"</H3>");
		out.println("<H3>所学专业："+mycourse+"</H3>");
		count++;
		out.println("<H3>当前的访问次数为："+count+"</H3>");
		out.println();
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
		doGet(request, response);
	}
	
	
}
