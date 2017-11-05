package com.bsl.java.Object_common12.test8;
//接口对象的实例化
public class TestInterface {

	public static void main(String[] args) {
		
		new Computer().work(new MoveDisk());
		new Computer().work(new Mp3());
	}

}
