package com.bsl.javacore.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//反射
public class ReflectDemo2 {
	@SuppressWarnings("all")    //压制所有警告
	public static void main(String[] args) throws Exception{
		
		Class class1 = Student.class;

		//com.bsl.javacore.reflect.Student
		System.out.println("class1.getName():" + class1.getName());
		//[Ljava.lang.Class;@6d9c638
		System.out.println("class1.getInterfaces():" + class1.getInterfaces());
		//权限修饰符
		System.out.println("class1.getModifiers():" + class1.getModifiers());
		System.out.println("Student类的权限修饰符："+ Modifier.toString(class1.getModifiers()));
		//super class java.lang.Object
		System.out.println("class1.getSuperclass():" + class1.getSuperclass());
		//If this class does not represent an array class this method returns null.
		System.out.println("class1.getComponentType():" + class1.getComponentType());
		//返回反射类的类名
		System.out.println("class1.getSimpleName() ："+ class1.getSimpleName());
		
		//返回反射类的所有构造器
		Constructor[] constructors = class1.getConstructors();
		System.out.println("Student类有：" + constructors.length + "个构造函数");
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		
		//返回反射类的制定的构造函数
		System.out.println("0个参数的制定构造器：");
		Constructor constructor = class1.getConstructor();		
		System.out.println(constructor);
		
		//返回反射类的所有的方法，包括继承来的方法
		Method[] methods = class1.getMethods();
		System.out.println("Student类中有：" + methods.length + "个方法");
		for (Method method : methods) {
			System.out.println(method);
		}
		//返回反射类的中声明的方法，包括接口的多态方法
		Method[] method1 = class1.getDeclaredMethods();
		System.out.println("Student类中有：" + method1.length + "个声明的方法");
		for (Method method : method1) {
			System.out.println(method);
		}
		
		//返回反射类中的成员属性个数
		System.out.println("Student类中有" + class1.getDeclaredFields().length + "声明的成员属性");
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
	

	}
}
