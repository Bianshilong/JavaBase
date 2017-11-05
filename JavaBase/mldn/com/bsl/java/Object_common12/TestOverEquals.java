package com.bsl.java.Object_common12;
//equals()方法的重写
class Worker{
	private String name;
	private int age;
	public Worker(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object o) {
		boolean temp = true;
		//声明一个wk1对象，该对象实际上就是当前调用equals方法的对象
//		Worker wk1 = this;
		//判断Object类对象是够是Worker的实例
		if (o instanceof Worker) {
			//如果是Worker类的实例，则进行向下转型
			Worker wk2 =(Worker) o;
			//调用String类中的equals方法
			if (!(this.name.equals(wk2.name) && this.age==wk2.age)) {
				temp=false;
			}
		}else{
			temp=false;
		}
		return temp;
	}
	//只要姓名相同就认为是同一个人
	public boolean compare(Worker wk) {
		if (this.name.equals(wk.name)) {
			return true;
		}else{
			return false;
		}
	}
}
public class TestOverEquals {
	public static void main(String[] args) {
		Worker wk1 = new Worker("zhangsan", 25);
		Worker wk2 = new Worker("zhangsan", 25);
		Worker wk3 = new Worker("zhangsan", 30);
		wk1.equals(wk2);
		wk1.compare(wk2);
		System.out.println(wk1.equals(wk2));
		System.out.println(wk1.compare(wk2));
		System.out.println(wk1.compare(wk3));
		System.out.println(wk1.equals(wk2)?"是同一个人！":"不是同一个人！");
		
	}
}
