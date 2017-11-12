package com.bsl.java.thread_19;

public class ThreadLife {

	public static void main(String[] args) {
		TestLife tl = new TestLife();
		Thread td = new Thread(tl);
		td.start();
		for (int j = 0; j < 10; j++) {
			
			if (j==5) {
				tl.stopMe();
			}
			System.out.println("Main 线程在运行！");
		}
	}

}

class TestLife implements Runnable{
	boolean flag = true;
	
	public void stopMe() {
		flag=false;
	}
	
	public void run() {
		while (flag) {
			System.out.println(Thread.currentThread().getName()+"在运行！");
		}
	}
	
	
}