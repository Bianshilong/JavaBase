package com.bsl.javacore.datatype;

import java.io.PrintStream;

public class Trans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream prt = System.out;
		
		
		//关系运输符
		int a = 30;
		int b = 50;
		prt.println("a > b :" + (a > b));
		prt.println("a >= b :" + (a >= b));
		prt.println("a < b :" + (a < b));
		prt.println("a <= b :" + (a <= b));
		prt.println("a != b :" + (a != b));
		prt.println("a == b :" + (a == b));
		
		//逻辑运算符
		boolean bn1 = true;
		boolean bn2 = false;
		prt.println("bn1 && bn2: " + (bn1 && bn2));
		prt.println("bn1 || bn2: " + (bn1 || bn2));
		prt.println("!bn1: " + !bn1);
		prt.println("(1<3) && (4<9): " + ((1<3) && (4<9)));
		
		//三目运算符
		int i = 5, j = 10;
		int result;
		result = i > j ? i : j;
		prt.println("result: " + result);
		
		//String
		String address1 = "Anhui";
		String address2 = "Hefei";
		int c = 189;
		String ret = address1 + " " + address2 + " " + c + " 号";
		prt.println("ret: " + ret);
		
		//类型转换
		int num = 10000;
		short shot;
		shot = (short) num;
		prt.println("shot:" + shot);
		
		//递增递减
				

	}
	
}
