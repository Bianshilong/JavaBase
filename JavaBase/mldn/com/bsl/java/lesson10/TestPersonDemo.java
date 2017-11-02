package com.bsl.java.lesson10;
//测试封装的必要性，不能随意更新类的值
public class TestPersonDemo {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("zhangsan");
		p.setAge(25);
		p.talk();
	}
}
