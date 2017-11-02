package com.bsl.java.lesson10;
//子类重写父类方法的实现
class Persoon{
	String name;
	int age;
	public String talk() {
		return "姓名:"+name+",年龄:"+age+"岁";
	}
}

class Studennt extends Persoon{
	
	String school;
	public Studennt(String name,int age,String school) {
		this.name=name;
		this.age=age;
		this.school=school;
	}
	public String talk() {
		return super.talk()+",学校:"+school;
	}
}

public class TestOverride {
	public static void main(String[] args) {
		Studennt st = new Studennt("张三",25,"北京");
		System.out.println(st.talk());
	}
}
