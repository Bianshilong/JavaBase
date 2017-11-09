package com.bsl.java.thread_19;
//获取和设置线程名称，测试线程状态
public class TestDemo1 {

	public static void main(String[] args) {
		
		Message ms = new Message();
		Thread tr = new Thread(ms);
		tr.setName("test thread");
		System.out.println("调用start()方法前，tr.isAlive():"+tr.isAlive());
		tr.start();
		System.out.println("调用start()方法后，tr.isAlive():"+tr.isAlive());
		for (int i = 0; i < 100; i++) {
			ms.PrintMsg();
// 		    tr.getName();
			
		}
		System.out.println("main()方法结束时，tr.isAlive():"+tr.isAlive());
	}

}
