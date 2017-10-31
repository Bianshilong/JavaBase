package com.bsl.java.io20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//使用PrintWriter打印字符流到文本中
public class FilePrint {

	public static void main(String[] args) {
		
		PrintWriter out = null;
		File file = new File("tmp.txt");
		
			try {
				FileWriter fw = new FileWriter(file);
				out=new PrintWriter(fw);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=i; j++) {
				out.print(j+"*"+i+"="+j*i+"\t");
			}
			out.println();
		}
		
		
		out.close();
		System.out.println("完成！！");
	}

}
