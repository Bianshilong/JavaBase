package com.bsl.java.common11;

public class Worker extends Person {
	
	public Worker(String name,int age,String occupation) {
		//默认调用父类的无参构造方法，来初始化父类
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}

	@Override
	public String talk() {

		return "工人---->姓名:"+this.name+",年龄:"+this.age+"岁，职业为:"+this.occupation;
	}

}
