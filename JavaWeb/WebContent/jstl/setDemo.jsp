<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bt" class="bean.BookBean" scope="request" />
	<c:catch var="error">
		<c:set var="count" value="${param.c+1}" scope="page"/>
		删除之前，变量count值为：<c:out value="${count}" /><br/>
		<c:remove var="count" scope="page"/>
		删除之前，变量count值为：<c:out value="${count}" /><br/>
	</c:catch>
	<c:set target="${bt}" property="bookName" value="Java" />
	bt.BookName:<c:out value="${bt.bookName}" /><br/>
	<c:out value="${error}" />
</body>
</html>