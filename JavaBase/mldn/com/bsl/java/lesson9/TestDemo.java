package com.bsl.java.lesson9;
//类属性和对象属性的初始化顺序
public class TestDemo {
	
	static String a = "string-a";
	static String b;
	
	String c = "string-c";
	String d;
	static{
		printStatic("before static");
		b="string-b";
		printStatic("after static");
	}
	public static void printStatic(String file) {
		System.out.println("--------"+file+"--------------");
		System.out.println(a);
		System.out.println(b);
	}
	public TestDemo(){
		print("befor constructor");
		d="string-d";
		print("after constructor");
	}
	public void print(String title) {
		System.out.println("-------"+title+"--------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	

	public static void main(String[] args) {
		
		new TestDemo();
	}

}
