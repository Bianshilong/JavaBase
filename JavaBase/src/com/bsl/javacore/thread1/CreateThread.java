package com.bsl.javacore.thread1;

public class CreateThread {
	public static void main(String[] args) {
		System.out.println("Main Thread is Start!");
		// 创建一个新的线程1
		MyThread thread1 = new MyThread(50);
		thread1.setName("thread1");
		// 设置优先级
		 thread1.setPriority(10);
		// 启动线程1
		thread1.start();
		// 创建一个新的线程2
		MyThread thread2 = new MyThread(100);
		 thread2.setPriority(1);
		thread2.setName("thread2");
		thread2.start();
		// 设置当前线程的优先级
		Thread.currentThread().setPriority(1);
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":" + i);
		}
		System.out.println("Main THread is Finish!");
	}

}

class MyThread extends Thread {
	private int n=0;
	public MyThread(int n) {
		this.n=n;
	}
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+"---is Start");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println(threadName + "线程让步：");
				yield();
			}
			System.out.println(threadName + ":" + i);
		}
		System.out.println(threadName+"--- is Finish!");
	}

}
