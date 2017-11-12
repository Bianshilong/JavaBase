package com.bsl.java.thread_19;
//死锁Demo B
public class B {
	
	synchronized void funB(A a){
		String name = Thread.currentThread().getName();
		System.out.println(name+"进入B.foo");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(name+"调用A类中的last()方法");
		a.last();
	}
	synchronized void last(){
		System.out.println("B类中的last()方法");
	}
}
