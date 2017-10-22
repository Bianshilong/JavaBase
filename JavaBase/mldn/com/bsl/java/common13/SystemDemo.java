package com.bsl.java.common13;

import java.util.Enumeration;
import java.util.Properties;

public class SystemDemo {

	public static void main(String[] args) {
		
		//getProperties方法时获得当前虚拟机的环境属性
		Properties sp = System.getProperties();
		Enumeration<?> e = sp.propertyNames();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = sp.getProperty(key);
			System.out.println(key+"="+value);
		}
	}
}
