package com.bsl.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextListenerDemo11
 *
 */
@WebListener
public class ServletContextListenerDemo11 implements ServletContextListener, ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ServletContextListenerDemo11() {
    	System.out.println("ServletContextListenerDemo11 start...");
    }
    
    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("contextInitialized init...");
    }
    
	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
         System.out.println("app --> add");
         System.out.println(arg0.getName()+"->"+arg0.getValue());
    }
    
    /**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
    	System.out.println("app ---> replace");
    	System.out.println("app --> replace before:"+arg0.getName()+"->"+arg0.getValue());
    	//会导致后一个属性还为读写，出现空值的情况，可以通过判断来实现
    	System.out.println("app --> replace after:"+arg0.getName()+"-->"+arg0.getServletContext().getAttribute(arg0.getName()));
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
         System.out.println("app ---> remove");
    }
    

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("contextDestroyed ...");
    }

	
	
	
}
