package com.bsl.java.lesson9;
//方法的使用
public class MethodDemo {
	int a = 12345679;
	int b = 81;
	public void times(int i,int j){
		System.out.println(i+"*"+j+"="+i*j);
	}

	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		m.times(m.a, m.b);
		
	}

}
