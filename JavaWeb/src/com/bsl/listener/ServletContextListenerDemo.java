package com.bsl.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextListenerDemo implements ServletContextListener {

	//初始化
	public void contextInitialized(ServletContextEvent event)  { 
		System.out.println("容器初始化－>"+event.getServletContext().getContextPath());
	}
	//销毁
    public void contextDestroyed(ServletContextEvent event)  { 
    	System.out.println("容器销毁，MajorVersion："+event.getServletContext().getMajorVersion());
    }
	
}
