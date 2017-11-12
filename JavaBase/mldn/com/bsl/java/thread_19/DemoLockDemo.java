package com.bsl.java.thread_19;
//死锁
public class DemoLockDemo {

	public static void main(String[] args) {
		
		new DeadLock();
	}
}
class DeadLock implements Runnable{
	
	A a = new A();
	B b = new B();
	public DeadLock() {

		Thread.currentThread().setName("Main---->Thread");
		new Thread(this).start();
		a.funA(b);
		System.out.println("main线程运行完毕");
	}
	public void run() {
		Thread.currentThread().setName("Test---->Thread");
		b.funB(a);
		System.out.println("其他线程运行完毕");
	}
}
