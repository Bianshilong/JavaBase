package com.bsl.entity;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {
	
	private String username;
	private String password;
	private String email;
	private String sex;
	private List<String> list;
	private Date birth;
	
	public User() {
	}

	public User(String username, String password, String email, String sex, List<String> list, Date birth) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.sex = sex;
		this.list = list;
		this.birth = birth;
	}
	
}
