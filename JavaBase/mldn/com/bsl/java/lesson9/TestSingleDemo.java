package com.bsl.java.lesson9;
//私有化的构造参数，只能在当前类中调用，不能再构造方法所在的类以外的地方被调用
public class TestSingleDemo {
	
	private TestSingleDemo() {
		System.out.println("private TestSingleDemo");
	}

	public static void main(String[] args) {
		
		TestSingleDemo tsd = new TestSingleDemo();
	}

}
