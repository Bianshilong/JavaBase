package com.bsl.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bsl.entity.User;
import com.bsl.service.IUserService;
import com.bsl.vo.Vo_user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
public class LoginController {

	 @Autowired
	private IUserService userService;
	// 验证用户登录的方法
	@RequestMapping(value = "/login")
	public String login(Vo_user vr) {
		User user = new User(vr.getName(),vr.getPass());
		String str=null;
		if (userService.checklogin(user)) {
			str="success";
		}
		return str;
	}
	
	//用户注册页面，注册成功后，显示信息
	@RequestMapping(value="/regst")
	public String register(Vo_user vr) {
		User user = new User();
		user.setUsername(vr.getName());
		user.setPassword(vr.getPass());
		user.setEmail(vr.getEmail());
		user.setTell(vr.getTell());
		user.setSex(vr.getSex());
		userService.add(user);
		return "success";
	}
}
