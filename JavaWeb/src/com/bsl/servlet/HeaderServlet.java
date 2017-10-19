package com.bsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;


@WebServlet("/servlet/HeaderServlet")
public class HeaderServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		
		PrintWriter out=response.getWriter();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
		String strDate=sdf.format(new Date());
		out.println("<table><tr>");
		out.println("<td width=200><font size=3 color='#000099'>"+strDate+"</font></td>");
		out.println("<td width=200><font size=5 color='#000099'><center>ABC有限责任公司</center></font></td>");
		out.println("</tr></table>");
		out.println("<marquee><font size=3 color='#000099'>Seconds sales of export quality Germents "
				+ "at Rockford Hall, new Delhi.</font></marquee>");
		out.println("<hr/>");
		//out.close();   此处不能关闭流，如果关闭，回到包含页面，也就输出完结，不再继续输出！！！
	}
}
