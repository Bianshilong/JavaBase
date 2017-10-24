<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Test ServletContextListener</h2>
	<%	
		application.setAttribute("name", "zhangsan");
		application.setAttribute("name", "lisi");
		application.removeAttribute("name");
		
		this.getServletContext().setAttribute("sex", "man");
		this.getServletContext().setAttribute("sex", "women");
		this.getServletContext().removeAttribute("sex");
		
	
	%>
</body>
</html>