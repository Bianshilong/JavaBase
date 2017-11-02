package com.bsl.java.lesson10;

class Human{
	public void fun1() {
		System.out.println("1 Human public void fun1() ");
	}
	public void fun2() {
		System.out.println("2 Human public void fun2() ");
	}
}

class Man extends Human{
	public void fun1() {
		System.out.println("3 Man public void fun1() ");
	}
	public void fun3() {
		System.out.println("4 Man public void fun2() ");
	}
	
	
}
public class TestJavaDemo {

	public static void main(String[] args) {
		//用子类来实例化父类对象
		Human hu = new Man();
		hu.fun1();
		hu.fun2();
		System.out.println("---------");
		//类型转换
		Human hn = new Human();
		/*Man mn = (Man) hn;
		mn.fun1();
		mn.fun2();*/ //报错，因为父类不知道谁是自己的子类，故无法向下转型，用子类来实例化父类对象，再向下转型
		Man mn =(Man) hu;
		mn.fun1();
		mn.fun2();
		mn.fun3();
	}

}
