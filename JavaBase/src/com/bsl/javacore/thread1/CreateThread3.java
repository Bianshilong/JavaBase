package com.bsl.javacore.thread1;

public class CreateThread3 {
	public static void main(String[] args) {
		// 打印当前线程的名称
		System.out.println("Thread.currentThread(): " + Thread.currentThread().getName());
		// 打印主线程的
		System.out.println("Thread.currentThread() : " + Thread.currentThread().getId());
		// 打印当前线程的优先级
		System.out.println("Thread.currentThread()优先级为：" + Thread.currentThread().getPriority());
		// 打印当前线程的状态，是否是活着的
		System.out.println("Thread.currentThread()的状态：" + Thread.currentThread().isAlive());
		// 打印当前线程是否设置为守护线程
		System.out.println("Thread.currentThread()是否是守护线程：" + Thread.currentThread().isDaemon());
	
	
	}

}
