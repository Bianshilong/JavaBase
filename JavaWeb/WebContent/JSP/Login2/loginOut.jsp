<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		prompt("确定要离开吗？", "true");
	</script>
	<%
		response.setHeader("refresh", "1;URL=login.jsp");    //定时跳转
		session.invalidate();     //注销系统
	%>
	<h3>您已成功退出本系统，１秒后跳转至首页！</h3>
	<h3>如果没有跳转成功，请按<a href="login.jsp">这里！</a></h3>
</body>
</html>