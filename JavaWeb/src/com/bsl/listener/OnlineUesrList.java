package com.bsl.listener;

import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.sun.org.apache.bcel.internal.generic.NEW;

@SuppressWarnings("all")
@WebListener
public class OnlineUesrList implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {

	private ServletContext app = null; // 用于application属性操作

	public void contextInitialized(ServletContextEvent sce) { // 上下文初始化
		this.app = sce.getServletContext();                         // 取得ServletContext实例
		this.app.setAttribute("online", new TreeSet());            //设置空集合，用于存储用户信息
	}

	public void attributeAdded(HttpSessionBindingEvent se) {  //增加session属性
		Set all = (Set) app.getAttribute("online");            //取出已有集合
		all.add(se.getValue());                                //增加新用户
		this.app.setAttribute("online", all);				   //重新保存
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {
		Set all = (Set) app.getAttribute("online");            //取出已有集合
		all.remove(se.getValue());								//删除离开用户
		this.app.setAttribute("online", all);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		Set all = (Set) app.getAttribute("online");
		all.remove(se.getSession().getAttribute("userid"));    //取出设置的内容
		this.app.setAttribute("online", all);
	}

	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
	}

}
