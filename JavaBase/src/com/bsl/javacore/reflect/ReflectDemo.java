package com.bsl.javacore.reflect;

//反射
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// 要想使用反射，先要有class对象
		// 获取Class类的实例对象

		// 第一种方式：通过类的class属性获取：类名.class
		Class class1 = Student.class;
		/*
		  第二种方式：通过对象的getClass()方法获取
		Class class2 = new Student().getClass();
		Student student = new Student();
		Class class2 = student.getClass();
		第三种方式：通过Class对象的forName()静态方法forName()获取，但可能抛出
		Class not found exception异常
		Class class3 = Class.forName("com.bsl.javacore.reflect.Student");
		*/
		//com.bsl.javacore.reflect.Student
		System.out.println("class1.getName():" + class1.getName());
		/*System.out.println("class2.getName():" + class1.getName());
		System.out.println("class3.getName():" + class1.getName());*/
		
		

	}
}
