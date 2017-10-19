package com.bsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitTestDemp
 */
@WebServlet(
		urlPatterns = { "/bookstore" }, 
		initParams = { 
				@WebInitParam(name = "bookname", value = "yuwen", description = "course"), 
				@WebInitParam(name = "booknum", value = "50", description = "num")
		})
public class InitTestDemp extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private String bookname;
	private int booknum;
    public InitTestDemp() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
			System.out.println("init初始化开始...");
			bookname=config.getInitParameter("bookname");
			booknum=Integer.parseInt(config.getInitParameter("booknum"));
			System.out.println("init初始化结束...");
	}

	public void destroy() {
		System.out.println("InitTestDemp init被销毁了...");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>获得初始化参数</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H3>书名："+bookname+"</H3>");
		out.println("<H3>数量："+booknum+"</H3>");
		out.println();
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
