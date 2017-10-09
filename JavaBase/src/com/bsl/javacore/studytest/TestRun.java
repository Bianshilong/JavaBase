package com.bsl.javacore.studytest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

@SuppressWarnings("all")
public class TestRun implements Runnable {

	@Override
	public void run(){
		Class class1 = MutipTable.class;
		try {
			MutipTable mutipTable = (MutipTable) class1.newInstance();
			Method method1 = class1.getMethod("printTable");
			method1.invoke(mutipTable);
			//空指针异常，暂时无法处理－－－－－BSL　　2017.10.9
//			Scanner in = new Scanner((Readable) method1.invoke(mutipTable));
//			Object s=null;
//			s= method1.invoke(mutipTable);
//			System.out.println(s);
//			FileOutputStream fos = new FileOutputStream("九九乘法表");
//			fos.write(s.getBytes());
//			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
