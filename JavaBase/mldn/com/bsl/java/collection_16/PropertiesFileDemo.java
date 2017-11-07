package com.bsl.java.collection_16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//在Properties类中使用store()和load()方法
@SuppressWarnings("all")
public class PropertiesFileDemo {

	public static void main(String[] args) {
		
		Properties settings = new Properties();
		try {
			settings.load(new FileInputStream("c:\\count.java"));
		} catch (Exception e) {
			settings.setProperty("count", new Integer(0).toString());
		}
		int c = Integer.parseInt(settings.getProperty("count"))+1;
		System.out.println("这是本程序第"+c+"次被使用");
		settings.put("count", new Integer(c).toString());
		try {
			settings.store(new FileOutputStream("c:\\count.java"), "PropertiesFileDemo use it");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
