package com.bsl.javacore.thread1;

public class DeadLockTest {
	public static void main(String[] args) {
		char[] a = { 'A', 'B', 'C' };
		char[] b = { 'D', 'E', 'F' };
		DeadLockThread t1 = new DeadLockThread(a, b);
		DeadLockThread t2 = new DeadLockThread(b, a);
		t1.start();
		t2.start();

	}
}

class DeadLockThread extends Thread {
	private char[] source;
	private char[] dest;

	public DeadLockThread(char[] source, char[] dest) {
		this.source = source;
		this.dest = dest;
	}

	public void run() {
		synchronized (source) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		synchronized (dest) {
			System.arraycopy(source, 0, dest, 0, source.length);
			System.out.println(dest);
		}
	}
}