package com.bsl.javacore.annotation;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

@Setter
@Getter
public class Student extends Human {

	private int score = 60;

	@HelloWorld("学生")
	private String desc;

	@HelloWorld
	private String info="AAA";

	@Override
	public String say() {
		return "Student say...";
	}

	@SuppressWarnings("all")
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("123");
		Student student = new Student();
	}

	@Override
	public String toString() {
		return "Student [score=" + score + ", desc=" + desc + ", info=" + info + "]";
	}
	
}
