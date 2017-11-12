package com.bsl.java.io_20;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
//字符流的演示
public class CharDemo {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\3.txt");
		Writer out = new FileWriter(file);
		Reader in = new FileReader(file);
		String str = "Hello World!!!";
//		byte[] b = str.getBytes();
		out.write(str);
		out.close();
		
		char[] b = new char[1024];
		int i = 0;
		i=in.read(b);
		in.close();
		String str1 = new String(b, 0, i);
		System.out.println(str1);
		
		
	}

}
