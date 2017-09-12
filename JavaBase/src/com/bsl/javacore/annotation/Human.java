package com.bsl.javacore.annotation;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
@SuppressWarnings("all")
public class Human {
	
	@Deprecated
	private String name;
	
	private Integer age;
	@Deprecated
	public String say() {
		return "Human say...";
	}
}
