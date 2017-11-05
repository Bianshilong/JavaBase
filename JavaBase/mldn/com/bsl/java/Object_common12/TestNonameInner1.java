package com.bsl.java.Object_common12;
//匿名内部类
public class TestNonameInner1 {

	public static void main(String[] args) {

		B b = new B();
		//显示的通过实现接口
		b.test();
		//隐式的实现接口
		b.test2();
	}

}
