package com.bsl.java.io20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

//合并流
public class SequenceDemo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis1 = null,fis2 = null;
		SequenceInputStream s = null;
		FileOutputStream fos = null;
		
		fis1 = new FileInputStream(new File("1.txt"));
		fis2 = new FileInputStream(new File("2.txt"));
		
		fos = new FileOutputStream(new File("12.txt"));
		s = new SequenceInputStream(fis1, fis2);
		
		int c;
		while ((c=s.read())!=-1) {
			fos.write(c);
		}
		fis1.close();
		fis2.close();
		s.close();
		fos.close();
		System.out.println("ok....");
	}

}
