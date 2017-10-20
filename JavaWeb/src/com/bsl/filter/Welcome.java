package com.bsl.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet implements FilterChain {
	private static final long serialVersionUID = 1L;
   
	
    public void doFilter(ServletRequest request, ServletResponse response) 
    		throws java.io.IOException, javax.servlet.ServletException { 
    	
    	
    }

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
