package com.bsl.javacore.array;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h,a;
		try {
			System.out.println("请输入等腰三角形的高：");
			h = input.nextInt();
			while (h < 2) {
				System.out.println("请输入不小于2的正整数！");
				h = input.nextInt();
			}
			System.out.println("请输入偏移量：");
			a = input.nextInt();
			while (a <0) {
				System.out.println("请输入正整数！");
				a = input.nextInt();
			}
			
		} catch (Exception e) {
			return;
		}

		int count = h - 1 + a;
		for (int i = 1; i <= h; i++, count--) {
			for (int j = 1; j <= count; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (i == 1) {
				System.out.println();
			} else if (i == h) {
				for (int j = 1; j < h * 2 - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else if (i > 1 && i < h) {
				for (int j = 1; j < i * 2 - 2; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}

		}
		if (a == 0) {
			System.out.println("图形没有偏移，偏移量为：" + a);
		} else if (a > 0) {
			System.out.println("向右偏移量为：" + a);
		} else if (a < 0) {
			System.out.println("向左偏移量为：" + a);
		}
	}
}
