package com.bsl.javacore.studytest;

import java.io.IOException;
import java.io.PrintStream;

public class Test {

	public static void main(String[] args) throws IOException {

		Runnable ru = new TestRun();

		Thread thread1 = new Thread(ru);

		thread1.start();


	}

}
