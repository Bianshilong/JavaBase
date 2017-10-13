<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	if(session.getAttribute("userId") != null){
	%>
		<h2>欢迎<%=session.getAttribute("userId") %>光临本系统  <a href="loginOut.jsp">注销!</a></h2>	
	<%
	}else{
	%>
		<h2>请先进行<a href="login.jsp">登录！</a></h2>
	<%
	}
	%>
</body>
</html>