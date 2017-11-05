package com.bsl.java.abstractAndinterface11;
//抽象类的实例化
/*子类中所有的构造方法默认都会访问父类中空参构造方法--->也就是说，子类new对象的时候，
先去父类中逛了一圈，完成了父类的初始化（父类初始化值存在子类new对象开辟堆内存的某块地方）
（再说白点，每一个构造方法的第一条语句默认是super(),有参也是）*/
public class TestAbstractDemo {

	public static void main(String[] args) {

//		Student st = new Student("张三", 25, "学生");
		Worker wk = new Worker("李四", 30, "工人");
		System.out.println(new Student("张三", 25, "学生").talk());
		System.out.println(wk.talk());
		
	}

}
