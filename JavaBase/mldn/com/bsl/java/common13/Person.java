package com.bsl.java.common13;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "姓名：" + name + ",年龄" + age;
	}
	public boolean equals(Object obj) {
		return true;
	}

	public int hashCode() {
		return age;
	}
}
