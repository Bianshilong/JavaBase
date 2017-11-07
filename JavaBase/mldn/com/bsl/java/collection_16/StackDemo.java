package com.bsl.java.collection_16;

import java.util.Stack;
@SuppressWarnings("all")
//Stack类，是一个后进先出类
public class StackDemo {

	public static void showPush(Stack st,int a){
		st.push(new Integer(a));
		System.out.println("入栈("+a+")");
		System.out.println("Stack"+st);
	}
	
	public static void showPop(Stack st) {
		System.out.println("出栈 ->");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("Stack"+st);
	}
	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		System.out.println("Stack:"+st);
		showPush(st,42);
		showPush(st,66);
		showPush(st,99);
		showPop(st);
		showPop(st);
		showPop(st);
		try {
			showPop(st);
		} catch (Exception e) {
			System.out.println("出现异常，栈中内容为空！");
		}
	}

}
