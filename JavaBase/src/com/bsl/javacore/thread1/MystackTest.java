package com.bsl.javacore.thread1;

public class MystackTest {
	public static void main(String[] args) {
		Mystack s=new Mystack();
		s.push('a');
		s.push('b');
		PushRunner1 r1=new PushRunner1(s);
		PopRunner1 r2=new PopRunner1(s);
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		System.out.println("stack.index"+s.index);
	}
	

}
class PushRunner1 implements Runnable {
	private Mystack s;

	public PushRunner1(Mystack s) {
		this.s = s;
	}

	public void run() {
		s.push('c');
	}
}

class PopRunner1 implements Runnable {
	private Mystack s;

	public PopRunner1(Mystack s) {
		this.s = s;
	}

	public void run() {
		s.pop();
	}
}