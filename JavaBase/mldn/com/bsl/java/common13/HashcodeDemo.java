package com.bsl.java.common13;

import java.util.HashMap;

@SuppressWarnings("all")
public class HashcodeDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(new Person("张三", 25), "张三");
		System.out.println(hm.get(new Person("张三", 25)));
	}


}
