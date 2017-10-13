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
		//request.setCharacterEncoding("ISO-8859-1");
		//String name=request.getParameter("name");
		//String newName= new String(name.getBytes("ISO-8859-1"),"utf-8");
		String s=new String(request.getParameter("name").getBytes("ISO-8859-1"),"gb2312") ;
		System.out.println("********:"+s);
		//System.out.println("********:"+name);
	%>
	name : <%= s%>;
	age : <%=request.getParameter("age") %>
</body>
</html>