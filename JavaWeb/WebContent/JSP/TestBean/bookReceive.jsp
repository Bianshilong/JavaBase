<%@ page import="bean.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="book" class="bean.BookBean">
		<%--  <jsp:setProperty name="book" property="bookName" value="JSP"/>
		<jsp:setProperty name="book" property="bookNum" value="20" />  
		 直接将值确定，无法通过方法获得html返回的值--%>
		<%--<jsp:setProperty name="book" property="bookName" param="bookName" />
		<jsp:setProperty name="book" property="bookNum" param="bookNum" />
		通过form或URL传递参数--%>
		<%-- <jsp:setProperty name="book" property="bookName" />
		<jsp:setProperty name="book" property="bookNum" />
		自动匹配,但如果属性名写错，就得不到想要的结果--%>
		<jsp:setProperty name="book" property="*" /><%--自己匹配所有的属性 --%>
 	</jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书订购</title>
</head>
<body>订购图书清单
	<hr/>
	书名：<%=book.getBookName() %><br>
	数量：<%=book.getBookNum() %><br>
	<hr/>
	<table border="1" cellpadding="0" bordercolor="green">
		<tr>
		<td>书名</td>
		<td>
		<jsp:getProperty property="bookName" name="book"/>
		</td>
		</tr>
		<tr>
		<td>数量</td>
		<td>
		<jsp:getProperty property="bookNum" name="book"/>
		</td>
		</tr>
	</table>
</body>
</html>