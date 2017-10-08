package com.bsl.javacore.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//FileReader/FileWriter，用于对文件进行读入和写出操作，只能操作文本文件，不能操作二进制文件
public class TestFileCharacterStream {

	public static void main(String[] args) {

		try {
			FileReader fr =new FileReader("D:/myInfo.txt");
			FileWriter fw =new FileWriter("myInfoBack.txt");
			int read=fr.read();
			while (read != -1) {
				fw.write(read);
				read=fr.read();
			}
			fr.close();
			fw.close();
			System.out.println("Copy Success!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
