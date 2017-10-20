package com.bsl.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AutyorityFilter
 */
@WebFilter(filterName="Authority",
		urlPatterns= {"/EnterDemo"},
		initParams= {@WebInitParam(name="encoding",value="UTF-8"),
		@WebInitParam(name="loginPage",value="/filter/login.jsp"),
		@WebInitParam(name="proLogin",value="/filter/proLogin.jsp")}
		)
public class AutyorityFilter implements Filter {

	private FilterConfig config;

	public void init(FilterConfig config) throws ServletException {
		this.config=config;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String encoding=config.getInitParameter("encoding");
		String loginPage=config.getInitParameter("loginPage");
		String proLogin=config.getInitParameter("proLogin");
		request.setCharacterEncoding(encoding);
		
		HttpServletRequest requ = (HttpServletRequest) request;
		HttpSession session=requ.getSession(true);
		String requestPath = requ.getServletPath();
		if (session.getAttribute("uesr")==null && 
				!requestPath.endsWith(loginPage) &&
				!requestPath.endsWith(proLogin)) {
			request.setAttribute("tip", "您还没有登录");
			request.getRequestDispatcher(loginPage).forward(request, response);
		}else {
			
			chain.doFilter(request, response);
		}
		
	}

	public void destroy() {
		this.config=null;
	}

}
