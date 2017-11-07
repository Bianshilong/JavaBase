package com.bsl.database.tran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class StTransactionDemo2 {
	
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/bsl_demo?useSSL=false";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	
	public static void main(String[] args) throws Exception{
		
		//注册驱动
		Class.forName(DBDRIVER);			
		Connection conn = null;
		Statement st = null;
		Savepoint sp = null;
		try {
			//建立连接
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
			//创建statement
			st = conn.createStatement();
			//关闭自提交功能
			conn.setAutoCommit(false);
			//执行SQL语句
			String sql = "insert into stu (age,name,tel) values ";
			st.executeUpdate(sql + "(23,'him','15988881111')");
			st.executeUpdate(sql + "(27,'gay','15977773333')");
			sp = conn.setSavepoint();		//设置保存点
			st.executeUpdate(sql + "(32,'paul‘,'15533334426')");	//制造错误'paul‘
			st.executeUpdate(sql + "(28,'west','15233168876')");
			sp = conn.setSavepoint();		//设置保存点
			st.executeUpdate(sql + "(25,'davis','15912345678')");
			//回滚数据
			conn.commit();
			//处理执行结果
			System.out.println("插入数据完成");
		} catch (Exception e) {
			conn.rollback(sp);
			conn.commit();			//此处必须提交，不然数据只是回滚到当前保存点，一直未提交
			System.out.println("遇到错误，回滚数据");
		}finally {
			//释放资源
			st.close();
			conn.close();
			System.out.println("释放资源");
		}
	}

}
