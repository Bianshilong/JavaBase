<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] books={"JAVA","C++","Python","PHP"};
		pageContext.setAttribute("book", books);
	%>
	<!-- 使用foreach来遍历 -->
	<h2>全部书目为：</h2>
	<c:forEach var="bookName" items="${book}">
		${bookName }<br/>
	</c:forEach>
	<h2>显示从10到15的整数值：</h2>
	<c:forEach var="i" begin="10" end="15" step="1">
		${i}&nbsp;&nbsp;
	</c:forEach>
	<h2>显示从1到100的奇数：</h2>
	<c:forEach var="i" begin="1" end="100" step="2">
		${i}&nbsp;&nbsp;
	</c:forEach>
</body>
</html>