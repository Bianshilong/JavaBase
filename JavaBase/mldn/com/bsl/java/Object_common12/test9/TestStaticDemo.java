package com.bsl.java.Object_common12.test9;
//static修饰符的使用
public class TestStaticDemo {
	public static void main(String[] args) {
		Person P1 = new Person("张三", 25);
		Person P2 = new Person("李四", 30);
		Person P3 = new Person("王五", 35);
		Person.city="中国";
		System.out.println("修改前的信息:"+P1.say());
		System.out.println("修改前的信息:"+P2.say());
		System.out.println("修改前的信息:"+P3.say());
		System.out.println("-------------------");
		Person.setCity("美国");
		System.out.println("修改前的信息:"+P1.say());
		System.out.println("修改前的信息:"+P2.say());
		System.out.println("修改前的信息:"+P3.say());
	}
	
}
