package com.bsl.javacore.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream/FileOutputStream用于对文件进行读入和写出操作，可以是文本，也可以是二进制文件
public class TestFileByteStream {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("D:/sun.jpg");
			FileOutputStream fos =new FileOutputStream("sunback.jpg");
			int read =fis.read();
			while (read != -1) {
				fos.write(read);
				read =fis.read();
			}
			fis.close();
			fos.close();
			System.out.println("Copy success!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
