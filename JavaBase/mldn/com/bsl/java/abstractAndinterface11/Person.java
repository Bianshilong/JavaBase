package com.bsl.java.abstractAndinterface11;

abstract class Person {
	
	String name;
	int age;
	String occupation;
	public Person() {
	}
	
	public Person(String name,int age,String occupation) {
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public abstract String talk();
}
