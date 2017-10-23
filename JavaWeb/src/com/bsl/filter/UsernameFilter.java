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
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.INCLUDE,
							  DispatcherType.INCLUDE,DispatcherType.ERROR},
			initParams={@WebInitParam(name="username",value="Tom")}
					, urlPatterns = { "/filter/hello.jsp" })
public class UsernameFilter implements Filter {
	
	private FilterConfig config;
	public void init(FilterConfig config) throws ServletException {
		System.out.println("--------");
		this.config=config;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest requ = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		if (!( config.getInitParameter("username").equals(requ.getParameter("username")))) {
			//新建JSP页面，内容为信息错误，设置3秒后跳转登录页面，若未跳转，点击链接
			resp.sendRedirect("/MyJavaWeb/filter/login1.jsp");
		}else {
		
		chain.doFilter(request, response);
		}
	}

	public void destroy() {
		System.out.println("----销毁----");
	}

}
