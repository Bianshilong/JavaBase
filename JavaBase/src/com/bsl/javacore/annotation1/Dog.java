package com.bsl.javacore.annotation1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("all")
public class Dog {
	@Run("旺财")
	private String name;
	
	private Integer age;
	@Run
	private String heal;
	
	public static void main(String[] args) {
		
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", heal=" + heal + "]";
	}
	
}
