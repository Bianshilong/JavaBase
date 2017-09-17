package com.bsl.javacore.thread1;

public class Mystack {
	int index = 0;
	char[] data = new char[10];

	public void push(char c) {
		synchronized (this) {
			data[index] = c;
			System.out.println("压入：" + c);
			index++;
			System.out.println("压入后指针上移");
		}
	}

	public synchronized char pop() {
		index--;
		System.out.println("弹出前指针下移");
		char c = data[index];
		System.out.println("弹出：" + c);
		return data[index];
	}
}
