package com.bsl.java.io20;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
//使用PrintWriter打印字符流到文本中
public class FilePrint {

	public static void main(String[] args) throws Exception{
		
		new PrintXX().printMt();
		System.out.println("完成！！");
	}

}

class PrintXX{
	
	public void printMt() throws Exception{
		File file = new File("tmp.txt");
		FileWriter fw = new FileWriter(file);
		PrintWriter	pw=new PrintWriter(fw);
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=i; j++) {
				pw.print(j+"*"+i+"="+j*i+"\t");
//				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			pw.println();
//			System.out.println();
		}
		pw.close();
	}
}