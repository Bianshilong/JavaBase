package com.bsl.java.Object_common12;
//引用数据类型的传递
class Hunman{
	String name;
	int age;
}
public class TestRefDemo1 {
	public static void main(String[] args) {
		
		Hunman hu1 = null;
		Hunman hu2 = null;
		hu1 = new Hunman();
		hu1.name="zhangsan";
		hu1.age=25;
		hu2=hu1;
		System.out.println("姓名："+hu2.name);
		System.out.println("年龄："+hu2.age);
		hu1=null;
		System.out.println(hu1);
	}
}
