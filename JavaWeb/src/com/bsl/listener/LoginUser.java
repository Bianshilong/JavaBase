package com.bsl.listener;

import lombok.Getter;
import lombok.Setter;

public class LoginUser {
	@Getter@Setter
	private String name;
	
	public LoginUser() {
	}
	
	public LoginUser(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "LoginUser [name=" + name + "]";
	}
	
	
}
