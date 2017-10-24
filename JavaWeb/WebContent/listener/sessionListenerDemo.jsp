<%@page import="com.bsl.listener.HttpSessionListenerDemo"%>
<%@page import="bean.BookBean"%>
<%@page import="com.bsl.listener.LoginUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Test SessionListenerDemo</h2>
	<%
		session.setAttribute("city", "hefei");
		session.setAttribute("city", "luan");
		session.removeAttribute("city");
		//创建BookBean实例
		BookBean bb = new BookBean("Java",20);
		BookBean bt = new BookBean("C++",25);
		session.setAttribute("book", bb);
		session.setAttribute("book", bt);
		session.removeAttribute("book");
		
		//创建HttpSessionListenerDemo实例
		HttpSessionListenerDemo hsld = new HttpSessionListenerDemo("zs");
		HttpSessionListenerDemo hsld2 = new HttpSessionListenerDemo("ls");
		session.setAttribute("user", hsld);
		session.setAttribute("user", hsld2);
		session.removeAttribute("user");
		
		
	%>
</body>
</html>