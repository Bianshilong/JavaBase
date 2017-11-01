package com.bsl.java.lesson9;
//定义一个Person类
public class Person {
	
	String name;
	int age;
	public Person() {
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String talk(){
		return "我是："+name+",今年:"+age+"岁";
	}
}
