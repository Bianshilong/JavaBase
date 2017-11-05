package com.bsl.java.Object_common12.test9;

public class Person {
	String name;
	int age;
	//static属性既可以在static类型的方法中使用，也可以在非static类型的方法中使用
	static String city;
	public Person(String name,int age) {
		
		this.name=name;
		this.age=age;
	}
	public String say() {
		return "我是:"+this.name+"，今年:"+this.age+"岁,来自:"+city;
	}
	//必须为静态方法，才能设置静态的属性city,static方法中必须调用static属性
	public static void setCity(String c) {
		city = c;
	}
}
