package com.bsl.java.Object_common12.test9;
//理解main方法
public class TestMain {

	public static void main(String[] args) {
		int j = args.length;
		if (j!=2) {
			System.out.println("输入参数个数有错误!");
			System.out.println("j:"+j);
			System.exit(1);
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
