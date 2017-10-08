package com.bsl.javacore.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class TestCharArrayReaderWriter {

	public static void main(String[] args) throws IOException {

		char[] charArray={'h','e','l','l','o',' ','w','o','r','l','d','!'};
		CharArrayReader car=new CharArrayReader(charArray);
		BufferedReader br=new BufferedReader(car);
		
		CharArrayWriter caw=new CharArrayWriter();
		BufferedWriter bw=new BufferedWriter(caw);
		
		char[] buf=new char[charArray.length];
		br.read(buf, 0, charArray.length);
		System.out.println(String.valueOf(buf));
		
		bw.write(buf);
//		bw.close();          效果等同于bw.flush();   两者用其一即可。
		bw.flush();
		System.out.println(caw.toString());
	}

}
