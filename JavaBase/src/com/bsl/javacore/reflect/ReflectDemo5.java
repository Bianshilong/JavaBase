package com.bsl.javacore.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.bsl.javacore.datatype.Person;

//反射实例，直接构造反射类中指定的构造器，以及指定的方法，指定的成员属性
@SuppressWarnings("all")
public class ReflectDemo5 {
	public static void main(String[] args) throws Exception {
		//获取class对象的方式
		Class class1 = Student.class;
		//返回反射类中的指定的构造器
		Constructor constructor = class1.getConstructor(java.lang.String.class,int.class);
		Student student = (Student) constructor.newInstance("lisigua",48);
		System.out.println(student);
		//返回反射类中指定的方法
		Method method = class1.getDeclaredMethod("printSelf",int.class);
		System.out.println(method);
		//用反射来调用方法		
		method.invoke(student,89356);
		//返回反射类中指定的成员属性
		Field field = class1.getDeclaredField("name");
		System.out.println(field);
		//成员属性为private,需要打破封装，强制访问
		field .setAccessible(true);
		//访问字段
		System.out.println("name = " + field.get(student));
		//设置字段
		field.set(student,"zhangshiqi");
		//设置后再次访问
		System.out.println("name = " + field.get(student));
		//成员属性为public，直接访问即可
		Field field2 = class1.getDeclaredField("sex");
		System.out.println(field2.get(student));
		field2.set(student, 1000);
		System.out.println(field2.get(student));
				
	}
}
