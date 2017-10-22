package com.bsl.java.common13;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) {

		Runtime run = Runtime.getRuntime();
		try {
			run.exec("notepad.exe");
			//run.exec("calc.exe");  打开系统计算器
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
