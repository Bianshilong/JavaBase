package com.bsl.java.lesson9;
//对象的使用
public class TestPersonDemo {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.name="zhangsan";
		p.age=25;
		System.out.println(p.talk());
		
	}
}
