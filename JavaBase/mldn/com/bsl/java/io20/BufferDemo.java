package com.bsl.java.io20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//字符流的转换
public class BufferDemo {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while (true) {
			System.out.println("请输入数字：");
			 try {
				str = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 int i = 0;
			 try {
				i = Integer.parseInt(str);
				 i++;
				 System.out.print("输入的数字修改后为："+i);
				 break;
			} catch (NumberFormatException e) {
				System.out.println("输入的内容不正确，请重新输入！");
			}
		}
	}

}
