package com.bsl.javacore.generics;


import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Jack");
		list1.add("James");
		list1.add("Jecia");
		list1.add("Kevin");
		list1.add("Paul");
		display(list1);

		System.out.println("-----------------------");

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(13);
		list2.add(28);
		list2.add(38);
		list2.add(49);
		list2.add(63);
		display(list2);

	}
	//类型通配符
	public static void display(ArrayList<?> list) {
		for (Object string : list) {
			System.out.println(string);
		}
	}
}
