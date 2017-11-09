package com.bsl.java.thread_19;
//获取和设置线程名称
public class TestDemo1 {

	public static void main(String[] args) {
		
		Message ms = new Message();
		Thread tr = new Thread(ms);
		tr.start();
		tr.setName("test thread");
		for (int i = 0; i < 100; i++) {
			ms.PrintMsg();
// 		    tr.getName();
			
		}
	}

}
