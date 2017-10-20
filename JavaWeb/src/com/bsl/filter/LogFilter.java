package com.bsl.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter(filterName="log",urlPatterns= {"/EnterDemo"})
public class LogFilter implements Filter {
	//Filter接口有３个方法，都需要实现，init(),doFilter(),destroy()
	//FilterConfig可用于访问Filter的配置信息
   private FilterConfig config;
   //实现初始化方法
   public void init(FilterConfig config) {
	   this.config=config;
   }
   //执行过滤的方法
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain) throws IOException, ServletException {
		ServletContext context=this.config.getServletContext();
		Long before=System.currentTimeMillis();
		System.out.println("开始过滤...");
		//向下转型
		HttpServletRequest hRequest =(HttpServletRequest) request;
		System.out.println("Filter已经截获到用户的请求地址："+hRequest.getServletPath());
		chain.doFilter(request, response);
		Long after =System.currentTimeMillis();
		System.out.println("过滤结束...");
		System.out.println("请求被定位到："+hRequest.getRequestURI()+"所花时间为："+(after-before));
	}
	//实现销毁的方法
	@Override
	public void destroy() {
		this.config=null;
	}

}
