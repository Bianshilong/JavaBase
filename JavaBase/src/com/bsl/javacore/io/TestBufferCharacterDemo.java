package com.bsl.javacore.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//BufferedReader/BufferedWriter用于缓冲读取和写入字符数据
public class TestBufferCharacterDemo {

	public static void main(String[] args) {

		try {
			FileReader input = new FileReader("D:/myInfo.txt");
			BufferedReader br = new BufferedReader(input);
			FileWriter output = new FileWriter("myInfoBack.txt");
			BufferedWriter bw = new BufferedWriter(output);
			String s = br.readLine();
			while (s != null) {
				bw.write(s);
				bw.newLine();
				s = br.readLine();
			}
			br.close();
			bw.close();
			System.out.println("Copy Success!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
