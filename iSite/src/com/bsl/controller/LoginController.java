package com.bsl.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bsl.dao.UserDao;
import com.bsl.entity.User;

import lombok.Getter;
import lombok.Setter;


@Getter@Setter
@Controller
public class LoginController {
	
	@Autowired
	private UserDao dao;
	
	//判断用户名和密码是否在数据库中
	@RequestMapping(value="/")
	public String login(String name,String pass) {
		List<User> users = dao.getUserByNameAndPass();
		String str = null;
		if (name.equals("") || pass.equals("")) {
			str="lose";
		}else{
			for (User user : users) {
				if (name.equals(user.getUsername()) && pass.equals(user.getPassword())) {
					str="login";
				}else{
					str="lose";
				}
			}
		}
		return str;
	}
}
