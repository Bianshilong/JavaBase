package com.bsl.java.thread_19;

public class Message implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			PrintMsg();
		}

	}
	
	public void PrintMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name:"+name);
	}

}
