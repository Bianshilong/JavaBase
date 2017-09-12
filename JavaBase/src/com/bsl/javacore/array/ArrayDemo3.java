package com.bsl.javacore.array;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// 数组的排序
		int[] num = new int[] { 8, 4, 2, 1, 23, 344, 12, 255, 968 };
		System.out.println("排序前的数组为：");
		for (int i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "] = " + num[i] + "  ");
		}
		System.out.println();
		System.out.println("排序后的数组为：");
		// 使用循环为数组排序
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[j] <num[i]) {
					num[i] = num[j];
				}
			}
			System.out.print("num1[" + i + "] = " + num[i] + "  ");
		}

	}
}
