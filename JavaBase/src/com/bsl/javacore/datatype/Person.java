package com.bsl.javacore.datatype;

public class Person {
	private String name = "Rose";
	private int age = 29;
	private Boolean married = true;
	
	public Person(){
		
	}
	public Person(String str, int i, Boolean flag){
		name = str;
		age = i;
		married = flag;
	}
	public void display(){
		System.out.println(name + " " + age + " " + married );
	}
	
	public static void main(String [] args){
		Person person = new Person("James",37,false);
		person.display();
	}
	
	
	
	
}
