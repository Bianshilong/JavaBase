package com.bsl.java.Object_common12;

public class B {
	int i = 10;
	class C implements A{
		public void fun1() {
			System.out.println("显示实现接口"+i);
		}
	}
	public void ptA(A a) {
		a.fun1();
	}
	public void test() {
		this.ptA(new C());
	}
	
	public void ptA2(A a){
		a.fun1();
	}
	public void test2(){
		this.ptA2(new A(){
			public void fun1() {
				System.out.println("没有显示实现接口："+i);
			}
		});
	}
}
