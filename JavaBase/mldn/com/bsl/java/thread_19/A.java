package com.bsl.java.thread_19;
//死锁Demo A
public class A {
	
	synchronized void funA(B b){
		String name = Thread.currentThread().getName();
		System.out.println(name+"进入A.foo");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(name+"调用B类中的last()方法");
		b.last();
	}
	synchronized void last(){
		System.out.println("A类中的last()方法");
	}
}
