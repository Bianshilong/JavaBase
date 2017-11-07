package com.bsl.database.curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class PsDeleteDemo {

	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/bsl_demo?useSSL=false";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws Exception {

		// 注册驱动
		Class.forName(DBDRIVER);
		// 建立连接
		Connection conn = null;
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		// 创建ps-statement
		ArrayList<Integer> ids = new ArrayList<Integer>();
		ids.add(16);
			// 构建批量删除id的SQL语句 ：delete from stu where id in (....);
		String sql = BulidIdsSQL("stu", ids);
		PreparedStatement ps = conn.prepareStatement(sql);
		// 执行SQL语句
		int i = ps.executeUpdate();
		// 处理执行结果
		System.out.println("插入数据完成,i=" + i);
		// 释放资源
		ps.close();
		conn.close();
	}

	public static String BulidIdsSQL(String tb_name, ArrayList<Integer> ids) throws Exception {
		if (ids == null || ids.size() == 0) {
			throw new Exception("集合不能为空！");
		} else {
			String idString = "";
			StringBuffer sb = new StringBuffer();
			int length = ids.size() - 1;
			for (int i = 0; i <= length; i++) {
				if (i < length) {
					sb.append(ids.get(i)).append(",");
				} else {
					sb.append(ids.get(i));
				}
			}
			idString = sb.toString();
			String sql = "delete from " + tb_name + " where id in ( " + idString + " )";
			return sql;
		}
	}
}
