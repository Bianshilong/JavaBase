package com.bsl.javacore.array;

import java.util.Scanner;
//循环输出数列的值，并求和
public class ArrayDemo {

	public static void main(String[] args) {

		// 声明数组的同时并赋值
		int[] num = new int[] { 8, 4, 2, 1, 23, 344, 12, 255 };
		// 声明数组的同时并赋值，另一种方式：int[] num = {8,4,2,1,23,344,12,255};
		/*
		 * 声明数组：int[] num; 分配空间：num = new int[8]; 赋值：num[0] = 19; 读取数组元素使用 num[5];
		 */

		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
			sum = sum + num[i];
		}
		System.out.println("\n" + sum);
		
		//猜数游戏，从键盘中任意输入一个数据，判断数列中是否包含此数：
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = input.nextInt();
		boolean correct = false;
		for (int i = 0; i < num.length; i++) {
			if (a == num[i]) {
				correct = true;
				break;
			}
		}
		if (correct) {
			System.out.println("恭喜您，您猜对了！");
		} else {
			System.out.println("很抱歉，您猜错了！");
		}

	}
}
