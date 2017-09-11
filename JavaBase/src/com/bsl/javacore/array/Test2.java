package com.bsl.javacore.array;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入直角三角形的高：");
		int h = input.nextInt();
		System.out.println("请输入偏移量：");
		int a = input.nextInt();
		int count = a;
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= count; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (i == 1) {
				System.out.println();
			} else if (i == h) {
				for (int j = 1; j <= h; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else if (i > 1 && i < h) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
		if (count==0) {
			System.out.println("图形没有偏移，偏移量为：" + count);
		}
		else if (count>0) {
			System.out.println("向右偏移量为：" + count );
		}
		else if (count<0) {
			System.out.println("向左偏移量为：" + count);
		}
	}
	

}