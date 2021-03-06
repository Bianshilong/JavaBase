package com.bsl.javacore.TestJava8;

//输出等腰三角形
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("all")
public class Test2 {

	public static void main(String[] args) {
		printTriangle();// 输出5行5列的等边，可以改变这个数字
	}	
		public static void printTriangle() {
		Scanner input = new Scanner(System.in);
		int n ,y;
		// 异常捕捉
		try {
			
			System.out.println("请输入行数：");
			n = input.nextInt();
			while (n<=1) {
				
				System.out.println("输入有误，必须为大于等于2的正整数！");
				n = input.nextInt();
				
			}
			
			//输入总行数（三角形的高）
			System.out.println("请输入位移数：");
			y = input.nextInt();         //输入位移位移数
			while (y<=0) {
				
				System.out.println("输入有误，必须为正整数！");
				y = input.nextInt();
				
			}
			
		} catch (Exception e) {
			
			return;
		}
				
		// 此为行数循环控制以及空格循环输出、三角形的水平移动
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i) + y; j++) {
				System.out.print(" ");
			}
			// 实现空心三角形
			if (i != n) {
				for (int k = 1; k <= 2 * i - 1; k++) {
					if (k == 1 || k == 2 * i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			} else {
				// 实现三角形底边长的输出（也就是末行输出）
				for (int k = 1; k <= 2 * i - 1; k++) {
					System.out.print("*");
					/*if (k % 2 != 0) {      //实现等边三角形的输出
						System.out.print("*");
					} else {
						System.out.print(" ");
					}*/
				}
			}
			System.out.println();
		}
	}
	}
