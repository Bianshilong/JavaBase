package com.bsl.controller;


import java.util.List;

import com.bsl.dao.UserDao;
import com.bsl.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Controller {
	
	private UserDao dao;
	List<User> users = dao.getUserList();
	
	//判断用户名和密码是否在数据库中
	public boolean login(String name,String pass) {
		boolean flag=false;
		for (User user : users) {
			if (name!=null && pass!=null && name.equals(user.getUsername()) && pass.equals(user.getPassword())) {
				flag=true;
			}
		}
		return flag;
	}
}
