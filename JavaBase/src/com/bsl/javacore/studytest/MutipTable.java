package com.bsl.javacore.studytest;

import java.io.FileOutputStream;

public class MutipTable {
	
	public MutipTable() {
	}
	
	public void printTable(){
		
	for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}
	
//	public void printTable ()throws Exception{
//		
//		FileOutputStream fos=new FileOutputStream("九九.txt");
//		String s = null;
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= i; j++) {
//				s=(j+"*"+i+"="+i*j+"\t");
//				if (i==j) {
//					s=(j+"*"+i+"="+i*j+"\t"+"\n");
//				}
//				fos.write(s.getBytes());
//			}
//		}
//		fos.close();
//		System.out.println("九九乘法表已打印至文件中！");
//	}
//	
	
}
