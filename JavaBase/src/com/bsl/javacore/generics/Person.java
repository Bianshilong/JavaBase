package com.bsl.javacore.generics;
//泛型类
public class Person<T> {
	private String name;
	private T pass;
    //get set 函数
	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	
	public T getPass() {
		return pass;

	}
	
	public void setPass(T pass) {
		this.pass = pass;
		
	}

}
