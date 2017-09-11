package com.bsl.javacore.array;

import java.util.Scanner;



public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h;
		System.out.println("请输入等腰三角形的高：");
		h = input.nextInt();
		int count = h-1;
		for (int i = 1; i <=h; i++,count--) {
			for(int j=1;j<=count;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if(i==1) {
				System.out.println();
			}else if (i==h) {
				for(int j=1;j<i*2-1;j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}else if (i>1 && i<h) {
				for(int j = 1;j<i*2-2;j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}
}
