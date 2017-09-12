package com.bsl.javacore.annotation;

import java.lang.reflect.Field;

import lombok.experimental.FieldDefaults;

@SuppressWarnings("all")
public class AnnotationProcessor {
	public static void main(String[] args) throws Exception {
		// 用反射得到一个对象的实例
		Class<Student> class1 = Student.class;
		// 创建一个新的对象
		Student student = new Student();
		System.out.println("使用注解处理前：" + student);
		// 获取所有字段并打印
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
			// 判断字段前是否有HelloWorld注释
			if (field.isAnnotationPresent(HelloWorld.class)) {
				HelloWorld helloWorld = field.getAnnotation(HelloWorld.class);
				//打印注解的值
				System.out.println("HelloWorld注解的值为：" + helloWorld.value());
				//打破封装
				field.setAccessible(true);
				//判断属性值是否为空或者空串
				String initvari = (String) field.get(student);
				if (null == initvari || "".equals(initvari)) {
					//将注解的值设置给属性
					field.set(student, helloWorld.value());
				}
			}
		}
		System.out.println("使用注解处理后：" + student);
	}
}
