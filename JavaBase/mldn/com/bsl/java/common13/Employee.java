package com.bsl.java.common13;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
class Employee implements Cloneable{
	private String name;
	private int age;
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public String toString() {
		return "姓名："+name+"，年龄："+age;
	}
}
