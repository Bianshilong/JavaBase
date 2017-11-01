package com.bsl.java.lesson9;
//在类的内部调用方法
public class TestPersonDemo3 {

	public static void main(String[] args) {
		
		Persn pn = new Persn();
		pn.setName("张三");
		pn.setAge(30);
		pn.say();
	}

}

class Persn{
	private String name;
	private int age;
	private void talk(){
		System.out.println("我是:"+name+",今年:"+age);
	}
	public void say() {
		talk();
	}
	public void setName(String str) {
		name =str;
	}
	public void setAge(int a) {
		if (a>0) {
			age=a;	
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
