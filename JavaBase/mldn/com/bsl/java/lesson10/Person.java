package com.bsl.java.lesson10;

import lombok.Getter;
import lombok.Setter;

public class Person {
	@Setter@Getter
	private String name;
	@Getter
	private int age;
	public Person() {
		System.out.println("public Person()");
	}
//	private void talk()    私有的属性和方法只能在本类中使用，其他的类无法调用，属性可以通过get、set方法来访问
	void talk() {
		System.out.println("我是:"+name+",今年:"+age+"岁");
	}
	public void setAge(int age) {
		if (age>0) {
			this.age=age;
		}else {
			this.age=0;
		}
	}
}
