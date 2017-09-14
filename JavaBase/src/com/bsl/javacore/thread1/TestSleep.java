package com.bsl.javacore.thread1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep {
	public static void main(String[] args) {
		MyThread2 thread = new MyThread2();
		thread.start();
	}
}

class MyThread2 extends Thread {
	
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss:SSSS");
		while (true) {
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}

}