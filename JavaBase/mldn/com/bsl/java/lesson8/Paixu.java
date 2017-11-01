package com.bsl.java.lesson8;

import java.util.Arrays;

//对数组进行排序输出
public class Paixu {

	public static void main(String[] args) {

		int[] alist = {25,24,12,76,98,101,90,28};
		System.out.println("排序前：");
		for (int i = 0; i < alist.length; i++) {
			System.out.print(alist[i]+"  ");
		}
		System.out.println();
		/*//使用数组自带方法排序
		Arrays.sort(alist);
		System.out.println("排序后：");
		for (int i = 0; i < alist.length; i++) {
			System.out.print(alist[i]+"  ");
		}*/
		//找出数组中的最大值
		int b = alist[0];
		for (int i = 0; i < alist.length; i++) {
			if (b<alist[i]) {
				b=alist[i];
			}
		}
		System.out.println("数组的最大值为："+b);
		//找出数组中的最小值
		int a = alist[0];
		for (int i = 0; i < alist.length; i++) {
			if (a>alist[i]) {
				a=alist[i];
			}
		}
		System.out.println("数组的最小值为："+a);
		//冒泡法排序，将第一个数与其他的数相比，如果比后面的数大，则替换较小的数
		for (int i = 0; i < alist.length; i++) {
			for (int j =i+1; j < alist.length; j++) {
				if (alist[i]>alist[j]) {
					int tem = alist[i];
					alist[i]=alist[j];
					alist[j]=tem;
				}
			}
		}
		System.out.println("排序后：");
		for (int i = 0; i < alist.length; i++) {
			System.out.print(alist[i]+"  ");
		}
	}

}
