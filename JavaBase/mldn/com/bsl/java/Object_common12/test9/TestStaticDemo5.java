package com.bsl.java.Object_common12.test9;
//静态代码块用来进行类属性的初始化
class Human{
	public Human() {
		System.out.println("1.Public Human()");
	}
	//此段代码会首先被执行
	static{
		System.out.println("2. Human类的静态代码块被调用！");
	}
}

public class TestStaticDemo5 {
	
	static{
		System.out.println("3. TestStaticDemo5类的静态代码块被调用！");
	}
	public static void main(String[] args) {

		System.out.println("4. 程序开始执行！");
		new Human();
		new Human();
		
	}

}
