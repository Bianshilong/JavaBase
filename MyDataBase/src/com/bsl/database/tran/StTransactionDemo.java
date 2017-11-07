package com.bsl.database.tran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StTransactionDemo {
	
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
		String sql = "insert into stu (age,name,tel) values ";
		//关闭自提交功能
		conn.setAutoCommit(false);
		//执行SQL语句
		st.executeUpdate(sql+"(23,'him','15988881111')");
		st.executeUpdate(sql+"(27,'gay','15977773333')");
		st.executeUpdate(sql+"(32,'paul','15533334426')");
		st.executeUpdate(sql+"(28,'west','15233168876')");
		st.executeUpdate(sql+"(25,'davis','15912345678')");
		//回滚数据
		conn.rollback();
//		int i = st.executeUpdate(sql);
		//处理执行结果
		System.out.println("插入数据完成");
		//释放资源
		st.close();
		conn.close();
	}

}
