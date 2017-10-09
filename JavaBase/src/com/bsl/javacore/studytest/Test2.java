package com.bsl.javacore.studytest;

import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {

		Runnable ru = new TestRun2();

		Thread thread1 = new Thread(ru);

		thread1.start();


	}

}
