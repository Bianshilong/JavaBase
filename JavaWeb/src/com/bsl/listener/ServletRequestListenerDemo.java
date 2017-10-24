package com.bsl.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Application Lifecycle Listener implementation class ServletRequestListenerDemo
 *
 */
@WebListener
public class ServletRequestListenerDemo implements ServletRequestListener, ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public ServletRequestListenerDemo() {
        System.out.println("ServletRequestListenerDemo start....");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         System.out.println("request destroyed....");
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
         System.out.println("request ---> remove:"+srae.getName());
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
         System.out.println("request ---> init");
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
         System.out.println("request ---> add-->"+srae.getName()+"="+srae.getValue());
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
         System.out.println("request ---> replace");
         System.out.println("request ---> replace,before:"+srae.getName()+"="+srae.getValue());
         System.out.println("request ---> replace,after:"+srae.getName()+"="+
        		 srae.getServletRequest().getAttribute(srae.getName()));
    }
	
}
