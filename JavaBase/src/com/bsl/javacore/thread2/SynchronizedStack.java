package com.bsl.javacore.thread2;

public class SynchronizedStack {

	private int index = 0;
	private char[] data = new char[6];

	public synchronized void push(char c) {
		while (index == data.length) {
			try {
				this.wait();    //线程等待后，后面的代码不会继续运行。
			} catch (InterruptedException e) {
			}

		}
		this.notify();   //线程通知，后面的代码会继续运行
		data[index] = c;
		index++;
	}

	public synchronized char pop() {
		while (index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		}
		this.notify();
		index--;
		return data[index];

	}
}

class Producer implements Runnable {
	SynchronizedStack stack;

	public Producer(SynchronizedStack s) {
		stack = s;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			char c = (char) (Math.random() * 26 + 'A');
			stack.push(c);
			System.out.println("生产：" + c);
			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (Exception e) {
			}

		}
	}
}

class Consumer implements Runnable {
	SynchronizedStack stack;

	public Consumer(SynchronizedStack s) {
		stack = s;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			char c = stack.pop();
			System.out.println("消费：" + c);
			try {
				Thread.sleep((int) (Math.random() * 500));
			} catch (Exception e) {
			}
		}
	}
}
