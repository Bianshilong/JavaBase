package com.bsl.javacore.generics;

import java.util.HashMap;

public class TestGenerics {
	public static void main(String[] args) {
		HashMap<Integer, String> person = new HashMap<Integer, String>();
		person.put(1, "Jack");
		person.put(2, "Rose");
		person.put(3, "James");
		String name3 = person.get(2);
		System.out.println("The NO.3 is :" + name3);

	}
}
