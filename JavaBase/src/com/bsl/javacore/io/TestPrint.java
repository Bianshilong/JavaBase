package com.bsl.javacore.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//PrintWriter，此类增强的字符输出流，实现了在PrintStream中所有的print方法
public class TestPrint {

	public static void main(String[] args) {

		try {
			FileReader input = new FileReader("D:/myInfo.txt");
			BufferedReader br = new BufferedReader(input);
			
			FileWriter output = new FileWriter("myInfoBack.txt");
			PrintWriter pw=new PrintWriter(output);
			String s = br.readLine();
			while (s != null) {
				pw.println(s);
				s=br.readLine();
			}
			br.close();
			pw.close();
			System.out.println("Copy Success!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
