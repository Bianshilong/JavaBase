<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>在线用户列表</h2>
	<%
		Set all = (Set) this.getServletContext().getAttribute("onl");
		out.println("在线用户人数是："+all.size());
		Iterator iter=all.iterator();
		out.println("在线用户为：");
		while(iter.hasNext()){
	%>
		<%= iter.next()%>
	<%	
		}
	%>
</body>
</html>