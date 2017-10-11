<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My First JSP</title>
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
	
	
</body>
</html>