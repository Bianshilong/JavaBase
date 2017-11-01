package com.bsl.java.lesson9;
//构造方法的私有使用
public class TestSingleDemo2 {

	public static void main(String[] args) {

		Person2 p = null;
		p = Person2.getP();
		System.out.println(p.name);
	}

}

class Person2{
	String name;
	private static final Person2 p = new Person2();
	private Person2(){
		name="张三";
	}
	
	public static Person2 getP(){
		return p;
	}
	
	
}