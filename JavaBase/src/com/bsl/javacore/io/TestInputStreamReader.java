package com.bsl.javacore.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//InputStreamReader/OutputStreamWriter，可以完成字节流到字符流的转换
public class TestInputStreamReader {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s;
		try {
			s = br.readLine();
			while (!s.equals("")) {
				System.out.println("read:" + s);
				s = br.readLine();
			}
			br.close();
//			System.out.println("Success!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
