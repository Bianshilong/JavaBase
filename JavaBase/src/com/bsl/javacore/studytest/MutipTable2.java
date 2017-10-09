package com.bsl.javacore.studytest;

import java.io.FileOutputStream;

public class MutipTable2 {
	
	public MutipTable2() {
	}
	public void printTable ()throws Exception{
		
		FileOutputStream fos=new FileOutputStream("九九.txt");
		String s = null;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				
				if (i==j) {
					s=(j+"*"+i+"="+i*j+"\t"+"\n");
					System.out.print(s);
				}else {
					s=(j+"*"+i+"="+i*j+"\t");
					System.out.print(s);
				}
				
				fos.write(s.getBytes());
			}
		}
		fos.close();
		System.out.println("九九乘法表已打印至文件中！");
	}
	
	
}
