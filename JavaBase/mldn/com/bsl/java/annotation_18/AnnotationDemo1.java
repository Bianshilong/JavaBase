package com.bsl.java.annotation_18;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationDemo1 {

	public static void main(String[] args) throws Exception{

		Class<?> cls = Class.forName("com.bsl.java.annotation_18.Info");
		Method mtd = cls.getMethod("toString");
		//获取全部的注解
		Annotation ant[] = mtd.getAnnotations();
//		for (int i = 0; i < ant.length; i++) {
			//isAnnotationPresent()如果在该元素上存在指定注解类型的注解，则返回true
			if (mtd.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation my = null;
				my = mtd.getAnnotation(MyAnnotation.class);
				String key = my.key();
				String value = my.value();
				System.out.println(key+"---->"+value);
			}
//		}
	}

}
