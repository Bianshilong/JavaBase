package com.bsl.java.abstractAndinterface11;

public class Student extends Person{

	public Student(String name,int age,String occupation) {
		//调用父类的有参构造方法，来初始化父类
		super(name,age,occupation);
	}
	@Override
	public String talk() {
		return "学生---->姓名:"+this.name+",年龄:"+this.age+"岁，职业为:"+this.occupation;
	}

}
