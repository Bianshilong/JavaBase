<%@page import="bean.BookBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<% pageContext.setAttribute("color", "lightblue"); %>
<body bgcolor="${pageScope.color }">
	<table border="1" align="center">
		<tr align="center">
			<td>逻辑运算</td>
			<td>EL表达式</td>
			<td>结果</td>
		</tr>
		<tr align="center">
			<td>与</td>
			<td>${'${'}true and true}</td>
			<td>${true and true}</td>
		</tr>
		<tr align="center">
			<td>与</td>
			<td>${'${'}true && false}</td>
			<td>${true && false}</td>
		</tr>
		<tr align="center">
			<td>或</td>
			<td>${'${'}true or false}</td>
			<td>${true or false}</td>
		</tr>
		<tr align="center">
			<td>或</td>
			<td>${'${'}true || false}</td>
			<td>${true || false}</td>
		</tr>
		<tr align="center">
			<td>非</td>
			<td>${'${'}not true}</td>
			<td>${not true}</td>
		</tr>
		<tr align="center">
			<td>非</td>
			<td>${'${'}！false}</td>
			<td>${!false}</td>
		</tr>
	</table>
	<p>浏览器的类型是：</p>
	${header['user-Agent']}<br>
	
	<%
		BookBean bt = new BookBean("Java",50);
		//在范围内查找，找到就返回值，不再往下找，找不到返回空
		pageContext.setAttribute("shu", bt);
		pageContext.setAttribute("age", 30);
	%>
	f1:<%=pageContext.findAttribute("age")%>
	<hr/>
	<p>书名的长度为：</p>
	${shu.getBookName().length()}<br/>
	${shu.getBookNum()}<br/>
	<p>书名是：</p>
	${shu.getBookName()}<br/>
	<p>page书名是：</p>
	${pageScope.shu.getBookName()}<br/>
	<p>request书名是：</p>
	${requestScope.shu.getBookName()}<br/>
	<p>sessionScope书名是：</p>
	${sessionScope.shu.getBookName()}<br/>
	<p>applicationScope书名是：</p>
	${applicationScope.shu.getBookName()}
	
	<hr/>
	${param.name+20}<br/>
	
	${empty param.name}<br/>
	
	${(4+3)>(3+2)?(4+3):(3+2)}<br/>
	
	<%
		Cookie ck1= new Cookie("Kobe","24");
		ck1.setMaxAge(3600);
		response.addCookie(ck1);
	%>
	
	name:${cookie.Kobe.name}<br/>
	No.:${cookie.Kobe.value}<br/>
	name:${cookie['Kobe'].name}<br/>
	No.:${cookie['Kobe'].value}<br/>
	
	${'${'}initParam.name}:${initParam.name}
	<%
		String name = application.getInitParameter("name");
	%>
	<%=name %>
	<hr/>
	${pageContext.session.id}<br/>
	<%--可以使用，但eclipse提示报错，可忽略 --%>
	<!--${pageContext.session.isNew()} <br/> -->
	<hr/>
	<!-- 跳转没有起到作用 -->
	<%-- ${pageContext.forward("../index.jsp")} 可以正常使用  --%>
	${response.sendRedirect("pageDirec.jsp")} 
	<%--  ${response.setHeader("refresh","3;URL=http://www.baidu.com")}  --%>
	<%--
	response.setHeader("refresh","3,URL=http://www.baidu.com");
	--%>
</body>
</html>