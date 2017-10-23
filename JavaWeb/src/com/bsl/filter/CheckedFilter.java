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
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class CheckedFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, urlPatterns = { "/ABCHomePage" })
public class CheckedFilter implements Filter {
	
    public CheckedFilter() {
    }
    
    public void init(FilterConfig fConfig) throws ServletException {
    	System.out.println("init...");
    }
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hreq = (HttpServletRequest) request;
		HttpServletResponse hres = (HttpServletResponse) response;
		HttpSession hSession = hreq.getSession();
		//hres.setCharacterEncoding("UTF-8");           //未起作用
		String username= (String) hSession.getAttribute("username");
		String tem = hreq.getRequestURI();
		System.out.println(tem);
		hSession.setAttribute("temurl", tem);       //记录当前要访问的页面url
		if (username==null || username=="") {
			hreq.getRequestDispatcher("/Unlogin").include(request, response);
			hres.setHeader("refresh", "3,URL=/MyJavaWeb/servlet/EnterDemo");
		}else {
		// pass the request along the filter chain
		chain.doFilter(request, response);
		}
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	

}
