package com.bsl.javacore.thread1;

public class CreateThread2 {
	public static void main(String[] args) {
		MyRunnable run = new MyRunnable();
		Thread thread1 = new Thread(run);// 通过线程创建新的线程
		thread1.setName("thread1");
		thread1.start();
		Thread thread2 = new Thread(run);
		thread2.setName("thread2");
		thread2.start();
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":" + i);
		}

	}

}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "---" + i);
		}
	}
}
