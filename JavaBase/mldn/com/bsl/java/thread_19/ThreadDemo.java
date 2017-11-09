package com.bsl.java.thread_19;

public class ThreadDemo {

	public static void main(String[] args) {

		TestThread t = new TestThread();
//		t.start();
		Thread t1 = new Thread(t);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main线程在运行！");
		}
	}

}
//继承Thread类实现多线程
//class TestThread extends Thread{
//实现Runnable接口实现多线程
class TestThread implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("TestThread 在运行");
		}
	}
}
