<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] books ={"JAVA","HTML","CSS","JSP"};
		session.setAttribute("book",books);
	%>
	小写字母转换：javacore&nbsp;&nbsp;${fn:toUpperCase("javacore")}<br/>
	<c:forEach var="str" items="${book}" >
		${str}&nbsp;&nbsp;&nbsp;
		${fn:toLowerCase(str)}<br/>
	</c:forEach>
	小写字母转换：${fn:toLowerCase(book[0])}<br/>
	获取长度：${fn:length("javacore")}<br/>
	获取books数组长度：${fn:length(book)}<br/>
	book的值连接成为一个字符串：${fn:join(book,"-") }<br/>
	<hr/>
	测试输入的字符串是否包含指定的子串：${fn:contains("abcdedffjfof","cddeed")}<br/>
	忽略大小写测试包含：${fn:containsIgnoreCase("abcdefgh","dEFgh") }<br/>
	跳过ＸＭＬ标记的字符：${fn:escapeXml("sadddaoo &gt dsjodos")}<br/>
	不跳过ＸＭＬ标记的字符：${"sadddaoo &gt dsjodos"}<br/>
	测试是否以输入字符串结尾：${fn:endsWith("abcdefgh","thd")}<br/>
	返回字符在字符串中的位置：${fn:indexOf("abcdefgh","e")}<br/>
	替换：${fn:replace("abcdxyz","xyz","efh") }<br/>
	分割成数组：${fn:split("abc:def:ghi:jkl",":")[0]}<br/>
	测试前缀：${fn:startsWith("abcdefgh","abc") }<br/>
	返回子串(返回的子串不包含开始位置)：${fn:substring("abcdefgh",3,6) }<br/>
	返回指定子串之前部分的子集：${fn:substringBefore("abcdefgh","efg")}<br/>
	返回指定子串之后部分的子集：${fn:substringAfter("abcdefgh","bcd")}<br/>
	移除首位空白：${fn:trim(" fsss ssss ssfssfd") }<br/>
	未移除首位空白：${" fsss ssss ssfssfd" }<br/>
</body>
</html>