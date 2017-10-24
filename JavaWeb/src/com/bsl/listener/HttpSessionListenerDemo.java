package com.bsl.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;
import javax.websocket.Session;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * Application Lifecycle Listener implementation class HttpSessionListenerDemo
 *
 */
@WebListener
public class HttpSessionListenerDemo implements HttpSessionListener, 
	HttpSessionAttributeListener, HttpSessionActivationListener, 
	HttpSessionBindingListener, HttpSessionIdListener {
	private String name;
	public HttpSessionListenerDemo(String name) {
	     this.name=name;
	     System.out.println("HttpSessionListenerDemo has args start...");
	    }
				
    @Override
	public String toString() {
		return "HttpSessionListenerDemo [name=" + name + "]";
	}

	/**
     * Default constructor. 
     */
    public HttpSessionListenerDemo() {
       System.out.println("HttpSessionListenerDemo start...");
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("session ---> created");
         System.out.println("arg0.getSession():"+arg0.getSession());
    }

    /**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         System.out.println("session ---> add");
         System.out.println(arg0.getName()+"="+arg0.getValue());
    }

    /**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
        System.out.println("session ---> replace");
        System.out.println("session -->replace before:"+arg0.getName()+"="+arg0.getValue());
        System.out.println("session --> replace after:"+arg0.getName()+"="+
        					arg0.getSession().getAttribute(arg0.getName()));
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         System.out.println("session ---> remove:"+arg0.getName());
    }
    
	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent arg0)  { 
    	System.out.println("session---valueBound:"+arg0.getName()+"="+arg0.getValue());
    	
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("session---valueUnBound:"+arg0.getName()+"="+arg0.getValue());
    }
    
	/**
     * @see HttpSessionIdListener#sessionIdChanged(HttpSessionEvent, String)
     */
    public void sessionIdChanged(HttpSessionEvent arg0, String arg1)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }


	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         System.out.println("session ---> destroy"+"--id--"+arg0.getSession().getId());
    }
}
