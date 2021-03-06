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
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class PasswordFilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.INCLUDE,
		  DispatcherType.INCLUDE,DispatcherType.ERROR},
initParams={@WebInitParam(name="password",value="1234")}
, urlPatterns = { "/filter/hello.jsp" })
public class PasswordFilter implements Filter {

	private String password;
	public PasswordFilter() {
        // TODO Auto-generated constructor stub
    }

    public void init(FilterConfig fConfig) throws ServletException {
    	password=fConfig.getInitParameter("password");
    }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletResponse resp = (HttpServletResponse) response;
		if (!(password.equals(request.getParameter("password")))) {
			resp.sendRedirect("/MyJavaWeb/filter/login1.jsp");
		}else {
		
		chain.doFilter(request, response);
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
