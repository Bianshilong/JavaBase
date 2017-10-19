package com.bsl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreadSafe
 */
@SuppressWarnings("all")
@WebServlet("/ThreadSafe")
public class ThreadSafe extends HttpServlet {

	String name;

	// 解决线程安全问题，增加synchronized关键字让方法让步
	public synchronized void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置文档类型及字符集
		response.setContentType("text/html;charset=UTF-8");
		//得到输出字符输出流
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet线程安全问题</title>");
		out.println("</head>");
		out.println("<body>");
		String ustr = request.getParameter("username");
		name = new String(ustr.getBytes("ISO-8859-1"), "UTF-8");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<h3>您好，" + name + "</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();   //关闭输出流

	}
}
