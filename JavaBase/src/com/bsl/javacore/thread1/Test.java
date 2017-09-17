package com.bsl.javacore.thread1;

public class Test {
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1(50);
		thread1.setName("thread1");
		thread1.start();
		thread1.setPriority(8);
		
		MyRunnable1 run = new MyRunnable1(30);
		Thread thread2 = new Thread(run);
		thread2.setName("thread2");
		thread2.start();
		thread2.setPriority(3);
	}

}

class MyThread1 extends Thread {

	public int n = 0;

	public MyThread1(int n) {
		this.n = n;
	}

	public void run() {
		int sum = 0;
		String threadName = Thread.currentThread().getName();
		for (int i = 0; i < n; i++) {
			if (i%2==0) {
				System.out.println(threadName+"数据让步：");
				yield();    //继承父类的yield方法；

			}
			sum += i;
			System.out.println(threadName + "第" + i + "个数自加的结果为：" + sum);
		}
	}
}

class MyRunnable1 implements Runnable {
	public int m = 0;

	public MyRunnable1(int m) {
		this.m = m;
	}

	public void run() {
		String threadName = Thread.currentThread().getName();
		for (int i = 0; i < m; i++) {
			if (i%2!=0) {
				System.out.println(threadName+"数据让步：");
				yield();    //需要自己写yield的方法
			}
			System.out.println(threadName + "输出的第" + i + "数据为：" + i);
		}

	}
	
	private void yield() {   
		 
	}
}
