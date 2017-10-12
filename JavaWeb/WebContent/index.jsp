<%@page import="java.util.*" isErrorPage="false" errorPage="http://www.baidu.com"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My First JSP</title>
<link rel= "short cut icon" href="/MyWebCore/favicon.ico" />
</head>
<body>
	<%-- 这是一个只有我能看到的注释 --%>
	<!-- 其实文档中还有一个注释，只不过你是找不到滴！！ -->
	<%!int i =50; %>
	<%!Date day = new Date(); %>
	<%!String s="Hello World!"; %>
	
	i = <%=i %>;
	<br/>
	Today is <%= day %>;
	<br>
	<%
		Date today =new Date();
		int hours=today.getHours();
		int minutes=today.getMinutes();
		if(hours>=0 && hours<12){
			out.println("欢迎访问，早上好！");
		}else if(hours>=12 && hours<19){
			out.println("欢迎访问，下午好！");
			//out.println("hours:"+hours+" "+"minutes:"+minutes);
			out.println("当前时间为："+hours+":"+minutes);
			
		}else{
			out.println("欢迎访问，晚上好！");
		}
	%>
	<hr/>
	<%@include file="./injsp/injsp.html" %>
</body>
</html>