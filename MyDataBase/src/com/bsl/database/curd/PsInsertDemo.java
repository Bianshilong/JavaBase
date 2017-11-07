package com.bsl.database.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//可变参数形式参数更新数据——插入数据
public class PsInsertDemo {
	
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
		//创建ps-statement,?表示占位符，可以有多个，多个?，就多次调用ps.setXXX()方法
		String sql = "insert into stu (age,name,tel) values (?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, 28);
		ps.setString(2, "use4");
		ps.setString(3, "15355536668");
		//执行SQL语句
		int i = ps.executeUpdate();
		//处理执行结果
		System.out.println("插入数据完成,i="+i);
		//释放资源
		ps.close();
		conn.close();
	}

}
