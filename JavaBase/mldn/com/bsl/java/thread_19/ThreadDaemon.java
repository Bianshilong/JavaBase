package com.bsl.java.thread_19;
//测试后台线程的运行机制
public class ThreadDaemon {

	public static void main(String[] args) {
		
		ThreadTest tt = new ThreadTest();
		Thread ts = new Thread(tt);
		ts.setDaemon(true);
		ts.start();
	}

}

class ThreadTest implements Runnable{
	
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName()+":is running!");
		}
	}
}