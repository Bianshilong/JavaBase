package com.bsl.listener;

import java.util.Hashtable;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class OnlineListener
 *
 */
@WebListener
public class OnlineListener implements HttpSessionListener 
{

    /**
     * Default constructor. 
     */
    public OnlineListener() {
        // TODO Auto-generated constructor stub
    }

	
    //当用户域服务器之间开始session时触发该方法
   
	public void sessionCreated(HttpSessionEvent se)  
    { 
       HttpSession session= se.getSession();
       ServletContext application = session.getServletContext();
       
       //获取session ID
       String sessionId=session.getId();
       
       //如果是一次新的会话
       if (session.isNew()) 
       {
		String user = (String) session.getAttribute("user");
		//未登录的用户当游客处理
		user= (user==null)?"游客":user;//使用三目运算来判断是否为游客
		
		Map<String, String> online = (Map<String, String>)
				application.getAttribute("online");
		if (online==null)
		{
			online = new Hashtable<String,String >();
		}
		//将用户信息放入Map中
		online.put(sessionId, user);
		application.setAttribute("online", online);
	}
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    //当用户域服务器之间session断开时触发该方法
    @SuppressWarnings("unchecked")
	public void sessionDestroyed(HttpSessionEvent se) 
    { 
        HttpSession session = se.getSession();
        ServletContext applition = session.getServletContext();
        String sessionId= session.getId();
        Map<String , String >online= (Map<String, String>)
        		applition.getAttribute("online");
        if (online!=null) {
			//删除该用户的在线信息
        	online.remove(sessionId);
		}
        applition.setAttribute("online", online);
    }
	
}

