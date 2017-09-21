package com.bsl.javacore.branch;

public class ControlTest {

	public static void main(String[] args) {
		System.out.println("计算1~100的数的和");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		int x = 0;
		for (int i = 1; i < 100; i += 6) {
			System.out.print(i + "\t");
			x++;
			if (x % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("九九乘法表：");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i*j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
