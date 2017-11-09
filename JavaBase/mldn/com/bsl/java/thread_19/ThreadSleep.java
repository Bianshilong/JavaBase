package com.bsl.java.thread_19;

public class ThreadSleep {

	public static void main(String[] args) {
		
		SleepTest st = new SleepTest();
		Thread td = new Thread(st);
		td.setName("my worker thread");
		td.start();
		try {
			td.sleep(700);
		} catch (InterruptedException e) {}
		st.loop();
	}

}

class SleepTest implements Runnable{
	public void run() {
		loop();
	}
	public void loop() {
		String name = Thread.currentThread().getName();
		System.out.println(name+"----->刚进入loop方法");
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("name="+name);
			}
		}
		System.out.println(name+"----->离开loop方法");
	}
}