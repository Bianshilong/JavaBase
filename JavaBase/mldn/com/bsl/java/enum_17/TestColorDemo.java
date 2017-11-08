package com.bsl.java.enum_17;

//测试枚举实现接口,以及测试枚举类中的抽象方法
public class TestColorDemo {
	
	public static void main(String[] args) {
		System.out.println("测试枚举类实现接口");
		for (Colr c : Colr.values()) {
			System.out.println(c.ordinal()+"-->"+c.name()+"-->"+c.getColr());
		}
		System.out.println("------------");
		System.out.println("测试在枚举中定义抽象方法");
		for (Colr2 c : Colr2.values()) {
			System.out.println(c.ordinal()+"-->"+c.name()+"-->"+c.getColr());
		}
	}

}
