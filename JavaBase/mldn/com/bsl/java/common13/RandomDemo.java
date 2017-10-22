package com.bsl.java.common13;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();
		//nextInt(参数)：返回一个0-参数的随机数
		for (int i = 0; i < 5; i++) {
			System.out.print(r.nextInt(50)+"\t");
		}
	}
}
