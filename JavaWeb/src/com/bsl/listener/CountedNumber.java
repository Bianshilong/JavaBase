package com.bsl.listener;

import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.sun.xml.internal.bind.v2.runtime.Name;


/**
 * Application Lifecycle Listener implementation class CountedNumber
 * @param <T>
 *
 */
//统计在线人数
@WebListener
public class CountedNumber implements ServletContextListener, 
	HttpSessionListener,HttpSessionAttributeListener{
	
	private ServletContext app = null;
    //无参的构造函数
    public CountedNumber() {
    }
    //初始化方法,定义一个集合，存储信息
    public void contextInitialized(ServletContextEvent sce)  { 
    	this.app = sce.getServletContext();
    	this.app.setAttribute("onl", new TreeSet());
    }
    //增加属性
    public void attributeAdded(HttpSessionBindingEvent se)  { 
         Set all = (Set) this.app.getAttribute("onl");
         String param = se.getName();
         if ("userid".equals(param)) {
			String name = (String) se.getValue();
			try {
				name=new String(name.getBytes("iso-8859-1"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			all.add(name);
			this.app.setAttribute("onl", all);
		}else {
			System.out.println("增加的属性并不是userid");
		}
    }
    //替换属性
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    }
	//删除属性
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	Set all = (Set) this.app.getAttribute("onl");
		String param = (String) se.getName();
		if ("userid".equals(param)) {
			all.remove(se.getValue());
			this.app.setAttribute("onl", all);
		}
    }
    //application销毁
    public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
    //session销毁
    public void sessionDestroyed(HttpSessionEvent se) {
    	Set all = (Set) this.app.getAttribute("onl");
		if (all.size() > 0) {
			all.remove(se.getSession().getAttribute("userid"));
		}
		this.app.setAttribute("onl", all);
		//打印销毁会话所用时间，需要在web.xml中设置会话有效时间
		System.out.println("session--持续时间:"+(System.currentTimeMillis()-se.getSession().getLastAccessedTime())+"ms");
    }
    //session创建
    public void sessionCreated(HttpSessionEvent se) {
    	
    }
	
}
