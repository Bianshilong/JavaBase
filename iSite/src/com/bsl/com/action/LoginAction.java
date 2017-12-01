package com.bsl.com.action;

import com.bsl.controller.Controller;
import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Controller controller;

	private String username;
	private String password;

	//判断用户名和密码是否正确。
	//在xml中配置action，根据返回结果不同配置多个result
	public String loginin() {
		String str;
		if (controller.login(username, password)) {
			str=SUCCESS;
		}else {
			str=ERROR;
		}
		return str;
	}
}
