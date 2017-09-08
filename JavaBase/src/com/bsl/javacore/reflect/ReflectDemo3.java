package com.bsl.javacore.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.bsl.javacore.datatype.Person;

//反射
@SuppressWarnings("all")
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {

		Class<Student> class1 = Student.class;
		//使用student2,必须有这个返回的反射类的构造器
		Constructor [] constructors = class1.getConstructors();
		
		//要想使用student3,必须有这个返回的反射类的构造器
		Constructor constructor = class1.getConstructor(java.lang.String.class, int.class);

		//使用反射来创建被反射类的实例对象
				
		//方式一：使用class对象的newInstance()方法，默认的无参
		Student student = class1.newInstance();
		System.out.println(student.toString());
		//方式二：使用指定的构造器，但先要将反射类中所有的构造器 返回
       //Student student3 = (Student) constructor.newInstance("wangwu",35);
		Student student2 = (Student) constructors[0].newInstance("lisi",33);
		System.out.println(student2);
		
		//获取声明的方法的方式
		//方法一：获取声明的所有方法
		System.out.println("Student类，有" + class1.getDeclaredMethods().length + "个声明的方法");
		Method[] methods = class1.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		//方法二：获取声明的指定的方法
		System.out.println("获取制定的方法printSelf:");
		Method method = class1.getDeclaredMethod("printSelf", int.class);
		System.out.println(method);
		Method method2 = class1.getDeclaredMethod("printSelf");
		System.out.println(method2);
		
		//用反射来调用方法---invoke()
		System.out.println("利用反射来调用制定的方法");
		method.invoke(student, 8903);
		method2.setAccessible(true);
		method2.invoke(student);    
		
		//获取声明的所有的字段
		System.out.println("Student类，有" + class1.getDeclaredFields().length + "个声明的成员属性！！！");
		Field [] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		//获取制定的字段
		System.out.println("获取制定的字段：");
		Field field = class1.getDeclaredField("name");
		System.out.println(field);
		Field field2 = class1.getDeclaredField("age");
		System.out.println(field2);
		
		//访问字段
		System.out.println("用反射访问字段：");
		field.setAccessible(true);   //打破封装，强制访问
		System.out.println("name = "+ field.get(student));
		
		//设置字段
		System.out.println("用反射设定属性值：");
		field.set(student,"wangwu");
		System.out.println("name = " +field.get(student));
		
	}
}
