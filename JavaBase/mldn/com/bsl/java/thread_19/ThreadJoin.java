package com.bsl.java.thread_19;

//线程的强制运行，在线程中加入另外一个线程运行
public class ThreadJoin {

	public static void main(String[] args) {
		
		ThreadTest2 t2 = new ThreadTest2();
		Thread td = new Thread(t2);
		td.start();
		int i = 0;
		for (int j = 0; j < 10; j++) {
			if (i==5) {
				try {
					td.join();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());;
				}
			}
			System.out.println("main thread:"+i++);
		}
	}

}

class ThreadTest2 implements Runnable{
	
	public void run() {
		
		for (int j = 0; j < 10; j++) {
			System.out.println(Thread.currentThread().getName()+"--->"+j);
		}
	}
}