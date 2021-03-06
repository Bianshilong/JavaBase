package com.bsl.javacore.generics;

//泛型方法的使用，可以为多个类型同时使用，避免多次编写代码，导致重复劳动，以及维护成本
public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		// String
		String value1 = t.evalutor ("abcd","edfg");
		String value2 = t.evalutor("aaaa", "aaaa");
		System.out.println(value1);
		System.out.println(value2);
		// Integer
		System.out.println("----------------------");
		Integer integer1 = t.evalutor(30, 56);
		Integer integer2 = t.evalutor(20, 20);
		System.out.println(integer1);
		System.out.println(integer2);
		
	}
	//泛型方法
	public <T> T evalutor(T a,T b) {
		if (a.equals(b)) {
			return a;
		}
		else {
			return null;
		}
	}

}
