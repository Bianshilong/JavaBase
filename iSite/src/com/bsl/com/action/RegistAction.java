package com.bsl.com.action;

import java.util.Date;

import com.bsl.entity.User;
import com.bsl.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter@Setter
public class RegistAction extends ActionSupport{
	
	private String username;
	private String password;
	private String email;
	private String sex;
//	private List<String> habirat;
	private Date birth;
	
	//创建一个User对象用来接收页面提交过来的注册信息
	private User user;
	//创建一个服务层对象来保存信息至数据库
	private UserService userService;
	
	public String execute() {
		
		user.setUsername(username);
		user.setPassword(password);
		user.setSex(sex);
		user.setEmail(email);
		//集合在页面被注释了
//		user.setHabirat(habirat);
		user.setBirth(birth);
		Long id = userService.add(user);
		
		return SUCCESS;
	}
	
	
}
