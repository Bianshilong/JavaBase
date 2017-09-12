package com.bsl.javacore.array;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 数组的排序
		int[] num = new int[] { 8, 4, 2, 1, 23, 344, 12, 255, 968 };
		System.out.println("排序前的数组为：");
		for (int i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "] = " + num[i] + "  ");
		}
		// 输出数组中的最大值
		int maxIndex = 0; // 输出最大值的索引
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
				maxIndex = i;
			}
		}
		System.out.println();
		System.out.println("数组中的最大值为：" + max + "，是num[" + maxIndex + "]");
		// 输出数组中的最小值
		int minIndex = 0;
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
				minIndex = i;
			}
		}
		System.out.println();
		System.out.println("数组中的最大值为：" + min + "，是num[" + minIndex + "]");
		Arrays.sort(num);
		System.out.println("排序后的数组为：");
		for (int i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "] = " + num[i] + "  ");
		}
		System.out.println();

		System.out.println("排序后的数组为(降序排列)：");
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print("num[" + i + "] = " + num[i] + "  ");
		}
		System.out.println();
		System.out.println("输出数组中的最大值：" + num[num.length - 1]);
		int a = (int) num.length / 2;
		System.out.println("奇数数组的中间数为:" + num[a]);

	}
}
