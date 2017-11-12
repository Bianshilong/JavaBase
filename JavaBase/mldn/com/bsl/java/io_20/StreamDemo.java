package com.bsl.java.io_20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamDemo {

	public static void main(String[] args) throws Exception{
		
		File file = new File("C:\\1.txt");
		OutputStream out = new FileOutputStream(file);
		InputStream in = new FileInputStream(file);
		byte[] b = "Hello World!".getBytes();
		out.write(b);
		out.close();
		byte[] b1 = new byte[1024];
		int i = 0;
		i=in.read(b1);
		in.close();
		System.out.println(new String(b1, 0, i));
		
	}

}
