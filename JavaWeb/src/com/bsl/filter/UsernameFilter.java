package com.bsl.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
	
					, urlPatterns = { "/login1.jsp" })*/
public class UsernameFilter implements Filter {
	
	private FilterConfig config;
	public void init(FilterConfig config) throws ServletException {
		System.out.println("--------");
		this.config=config;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest requ = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		System.out.println("requ.getParameter(\"username\")"+requ.getParameter("username"));
		System.out.println(config.getInitParameter("username"));
		if (!requ.getParameter("username").equals( config.getInitParameter("username"))) {
			resp.sendRedirect("login1.jsp");
		}else {
		
		chain.doFilter(request, response);
		}
	}

	public void destroy() {
		System.out.println("----销毁----");
	}

}
