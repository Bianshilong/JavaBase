package com.bsl.javacore.array;

import java.util.Scanner;

//以表格的形式输出5笔购物金额及总金额
public class Shoping {
	
	public static void main(String[] args) {
		double[] cost = new double[5];
		double sum = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录：");
		for(int i = 0;i<5;i++) {
			cost[i] = input.nextDouble();
			sum = sum + cost[i];
		}
		System.out.println("序号" + "\t"+ "\t"+ "\t" + "金额(元)");
		for(int i = 0;i<5;i++) {
			System.out.println((i+1) + "\t"+ "\t"+ "\t"+cost[i]);
		}
		System.out.println("总金额为："+ "\t"+ "\t"+ "\t" + sum);
	}
}
