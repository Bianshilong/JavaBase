package com.bsl.java.common13;


public class CloneDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("张三", 25);
		Employee e2 = null;
		try {
			e2=(Employee) e1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		e2.setName("李四");
		e2.setAge(26);
		System.out.println("e1==e2:"+(e1==e2));
		System.out.println(e1);
		System.out.println(e2);
	}
	
}

