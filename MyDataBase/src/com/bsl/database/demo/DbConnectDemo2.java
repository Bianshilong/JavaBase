package com.bsl.database.demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class DbConnectDemo2 {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/bsl_demo";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	public static void main(String[] args) throws Exception {
		//注册驱动
//		Class.forName("com.mysql.jdbc.Driver"); //方式一
		Class.forName(DBDRIVER);				//方式二
		//建立连接,导入java.sql.Connection包
		Connection conn = null;
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		//创建statement
		Statement st = conn.createStatement();
		String sql = "select * from stu where age>25 and id > 10";
		//执行SQL语句
		ResultSet rs= st.executeQuery(sql);
		//循环处理得到的结果集
		System.out.println("id \t\t age \t\t name \t\t tel\t\t");
		while (rs.next()) {
			//取得每一条记录中的数据
			int id=rs.getInt("id");
			int age = rs.getInt("age");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			//输出我们的每一条记录
			System.out.println(id+" \t\t"+age+" \t\t"+name+" \t\t"+tel+" \t\t");
		}
		//数据输出完毕
		System.out.println("数据输出完毕");
		//释放资源
		rs.close();
		st.close();
		conn.close();
	}

}
