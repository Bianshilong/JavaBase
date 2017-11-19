package com.bsl.java.io20;

import java.io.Serializable;

//要序列化的属性类
public class Person implements Serializable {
	
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return "姓名:"+this.name+",年龄:"+this.age;
	}
}
