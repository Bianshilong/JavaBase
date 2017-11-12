package com.bsl.java.thread_19;

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		TestDemo td = new TestDemo();
		new Thread(td).start();
		new Thread(td).start();
		new Thread(td).start();
		new Thread(td).start();
	}

}
//线程同步及线程不安全问题
class TestDemo implements Runnable{
	
	private int tickets = 20;
	boolean flag = true;
	public synchronized void run(){
		
		while (flag) {
			if (tickets>0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
			}else{
				flag=false;
			}
			
		}
	}
}
