package com.bsl.database.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StInsertDemo {
	
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/bsl_demo?useSSL=false";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	
	public static void main(String[] args) throws Exception{
		
		//注册驱动
		Class.forName(DBDRIVER);			
		//建立连接
		Connection conn = null;
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		//创建statement
		Statement st = conn.createStatement();
		String sql = "insert into stu values (0,33,'user1','13555556666'),"
				+ "(0,36,'user2','13555557777'),(0,33,'user3','13555558888')";
		int i = st.executeUpdate(sql);
		System.out.println("插入数据完成,i="+i);
		st.close();
		conn.close();
	}

}
