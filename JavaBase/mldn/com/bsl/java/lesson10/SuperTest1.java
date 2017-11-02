package com.bsl.java.lesson10;

class Persn{
	
	String name;
	int age;
	public Persn(String name,int age) {
		
		this.name=name;
		this.age=age;
	}
}

class Studet extends Persn{
	
	String school;
	public Studet() {
		super("zhangsan", 25);
	}
	
}
public class SuperTest1 {
	
	public static void main(String[] args) {
		Studet st = new Studet();
		st.school="北京";
		System.out.println("姓名:"+st.name+",年龄:"+st.age+"岁，在:"+st.school);
	}
}
