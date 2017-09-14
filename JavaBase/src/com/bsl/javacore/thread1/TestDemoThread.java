package com.bsl.javacore.thread1;

public class TestDemoThread {
	public static void main(String[] args) {
		System.out.println("Main thread is Start!");
		Thread1 thread1 = new Thread1(50);
		thread1.setName("thread1");
		thread1.start();
		Thread1 thread2 = new Thread1(200);
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		for (int i = 0; i < 100; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "---" + i);

		}
		System.out.println("Main Thread is finish");

	}
}

class Thread1 extends Thread {
	private int n = 0;

	public Thread1(int n) {
		this.n = n;
	}

	public void run() {
		String threadName = Thread.currentThread().getName();
		for (int i = 0; i < n; i++) {
			System.out.println(threadName + "---" + i);
		}
		System.out.println(threadName + "--is finish");
	}
}
