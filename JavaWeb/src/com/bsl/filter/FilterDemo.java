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

/**
 * Servlet Filter implementation class FilterDemo
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					,urlPatterns = {"/ABCHomePage" })
public class FilterDemo implements Filter {
	
	public void destroy() {
		System.out.println("FilterDemo destroy end...");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request2 =(HttpServletRequest) request;
		System.out.println("FilterDemo 开始拦截...");
		
		chain.doFilter(request, response);    //调用链上的一个Filter或Servlet，如果没有，就相当拦截了Filter
		System.out.println("拦截的URL："+request2.getRequestURL());
		//获取URL后的查询串
		String queryString = request2.getQueryString();
		String query =queryString==null? "":"?"+queryString;
		System.out.println("拦截的URL："+request2.getRequestURL().toString()+query);
		System.out.println("拦截的URI："+request2.getRequestURI());
		System.out.println("拦截的查询串："+queryString);
		System.out.println("FilterDemo 拦截结束...");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterDemo init start...");
	}

}
