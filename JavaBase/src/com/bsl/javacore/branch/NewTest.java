package com.bsl.javacore.branch;

import java.util.Scanner;

@SuppressWarnings("all")

public class NewTest {

	public static void printF() {
		int higt;
		int a;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入多边形的高：");
		
		higt = input.nextInt();
		System.out.println("请输入位移量：");
		a=input.nextInt();
		System.out.println("四边形为：");
		for (int i = 1; i <= higt; i++) {
			for (int j = 1; j <=a; j++) {
				System.out.print(" ");
			}
			if (i == 1 || i == higt) {
				for (int j = 1; j <= 2 * higt; j++) {
					System.out.print("*");
				}

			} else {
				for (int j = 1; j <= 2 * higt; j++) {
					if (j == 1 || j == 2 * higt) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		printF();
	}
}
