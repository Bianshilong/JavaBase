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
	//避免乱码，如果在include页面设置时，已经迟了。需要在本页面设置
	request.setCharacterEncoding("UTF-8"); 
	%>
	<p align="center">新书展示</p><hr>
		<table border="1" align="center">
			<tr><td>
	<jsp:include page="newbook1.html" flush="true" /></td>
			<td>
	<jsp:include page="newbook2.html" flush="true" /></td></tr>
			<tr><td>
	<jsp:include page="newbook3.html" flush="true" /></td>
			<td>
	<jsp:include page="newbook4.html" flush="true" /></td></tr>
		</table>
	<jsp:include page="netbook5.jsp">
		<jsp:param value="张三" name="name"/>
		<jsp:param value="28" name="age"/>
	
	</jsp:include>
</body>
</html>