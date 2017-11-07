<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试tomcat数据源</title>
</head>
<body>
	<%
		Context cxt = new InitialContext();
		Context envContext = (Context) cxt.lookup("java:comp/env");
		DataSource ds = (DataSource) cxt.lookup("java:comp/env/dashabi");
		Connection conn = ds.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from stu");
		while(rs.next()){
			out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+
				rs.getInt(3)+"\t"+rs.getInt(4)+"</br>");
		}
	
	
	%>
</body>
</html>