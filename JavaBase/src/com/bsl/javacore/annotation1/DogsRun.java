package com.bsl.javacore.annotation1;

import java.lang.reflect.Field;

import lombok.experimental.Value;

@SuppressWarnings("all")
public class DogsRun {

	public static void main(String[] args) throws Exception {
		// 获取一个Dog的对象的实例
		Class<Dog> class1 = Dog.class;
		// 创建一个对象
		Dog dog = new Dog();
		System.out.println("注解处理前：" + dog);
		// 获取所有字段并打印
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
			// 判断字段前是否有注释
			if (field.isAnnotationPresent(Run.class)) {
				Run run = field.getAnnotation(Run.class);
				System.out.println("获得注释的值：" + run.value());

				// 判断对象实例的属性是否为空或者空串
				field.setAccessible(true);
				String intV = (String) field.get(dog);
				if (null == intV || "".equals(intV)) {
					field.set(dog, run.value());
				}
			}
		}
		System.out.println("处理注释后值："+dog);
	}
}
