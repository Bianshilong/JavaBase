package com.bsl.javacore.thread1;

public class CreateThread {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.start();
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.start();
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":" + i);
		}

	}

	
}
class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":" + i);
		}
	}

}

