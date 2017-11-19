package com.bsl.java.io20;

import java.io.FileOutputStream;
import java.io.OutputStream;
//编码方式
public class EncodingDemo {

	public static void main(String[] args) throws Exception {
		
//		byte[] b = "大家一起来学Java语言".getBytes("GB2312");
		byte[] b = "大家一起来学Java语言".getBytes("iso8859-1");
		OutputStream out = new FileOutputStream("123.txt");
		out.write(b);
		out.close();
		System.getProperties().list(System.out);
	}

}
