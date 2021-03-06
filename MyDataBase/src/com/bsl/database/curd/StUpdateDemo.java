package com.bsl.database.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StUpdateDemo {
	
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
		String sql = "update stu set tel='15788886677',name='kobe' where id = 14";
		//执行SQL语句
		int i = st.executeUpdate(sql);
		//处理执行结果
		System.out.println("插入数据完成,i="+i);
		//释放资源
		st.close();
		conn.close();
	}

}
