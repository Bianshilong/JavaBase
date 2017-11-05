package com.bsl.java.exception_15;

public class TestException {

	public static void main(String[] args) {
		
		try {
			int[] arr = new int[5];
			arr[10] = 7;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组超出绑定范围！");
			System.out.println("异常："+e);
		}
		finally {
			System.out.println("这里一定会被执行！");
		}
//		System.out.println("main()方法结束！");
		int a = 4,b=0;
		try {
			if (b==0) {
				throw new ArithmeticException("一个算术异常");
			}
		} catch (ArithmeticException e) {
			System.out.println("抛出异常:"+e);
		}
	}

}
