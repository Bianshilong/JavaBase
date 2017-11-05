package com.bsl.java.exception_15;

public class TestException2 {

	public static void main(String[] args) {

		try {
			throw new DefaultException("自定义异常！");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
