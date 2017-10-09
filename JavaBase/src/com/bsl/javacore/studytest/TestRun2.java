package com.bsl.javacore.studytest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressWarnings("all")
//打印到文件
public class TestRun2 implements Runnable {

	@Override
	public void run() {
		Class class1 = MutipTable2.class;
		try {
			MutipTable2 mutipTable2 = (MutipTable2) class1.newInstance();
			Method method1 = class1.getMethod("printTable");
			method1.invoke(mutipTable2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
