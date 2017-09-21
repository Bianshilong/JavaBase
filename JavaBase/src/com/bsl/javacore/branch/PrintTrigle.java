package com.bsl.javacore.branch;

import java.util.Scanner;
@SuppressWarnings("all")

public class PrintTrigle {
	
	public static void printStars() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入等腰三角形的高：");
		int higt = input.nextInt();
		try {
			if (!(higt > 1)) {
				System.out.println("输入的高度不合法！请重新输入：");
				higt=input.nextInt();
			}
		} catch (Exception e) {
			return;
		}
		
		for (int i = 1; i <= higt; i++) {
			//打印三角形每一行前面空格部分
			for (int j = 1; j <=higt-i ; j++) {
				System.out.print(" ");
			}
			//打印三角形每一行的*的个数
			for (int j = 1; j <=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		printStars();
	}
}
