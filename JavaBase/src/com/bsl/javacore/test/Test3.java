package com.bsl.javacore.test;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test3 {
	
	private static Logger logger=Logger.getLogger(Test3.class);
	
	public static void divide() {
		Scanner input =new Scanner(System.in);
		
		System.out.println("请输入被除数和除数：");
		int a;
		int b;
		
		a=input.nextInt();
		b=input.nextInt();
		try {
			int c=a/b;
			if (b==0) {
				b=input.nextInt();
			}
		} catch (ArithmeticException e) {
			logger.warn("除数不能为零");
		}catch (IllegalArgumentException e) {
			logger.error("被除数和除数必须是整数！");
		}catch(Exception e){
			logger.info("输入数据正常！");
		}
		
	}
		
	
	public static void main(String[] args) {
		divide();
	}
}
	
