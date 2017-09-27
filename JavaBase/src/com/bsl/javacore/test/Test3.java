package com.bsl.javacore.test;

import java.util.InputMismatchException;
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
			logger.info("输入数据正常");
		} catch (ArithmeticException e) {
			logger.warn("除数不能为零");
		}catch (InputMismatchException e) {
			logger.error("被除数和除数必须是整数！");
		}
		finally {
			input.next();
		}
	}
		
	
	public static void main(String[] args) {
		divide();
	}
}
	
