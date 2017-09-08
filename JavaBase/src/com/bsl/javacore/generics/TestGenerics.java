package com.bsl.javacore.generics;

import java.util.HashMap;
public class TestGenerics {
	public static void main(String[] args) {
		// 泛型的使用，对变量的泛型，避免向下转型，导致代码出错。
		HashMap<Integer, String> person = new HashMap<Integer, String>();
		person.put(1, "Jack");
		person.put(2, "Rose");
		person.put(3, "James");
		String name3 = person.get(1);  //此处避免转型
		System.out.println("The NO.3 is :" + name3);

	}
}
