package com.bsl.java.io_20;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//字节数组流的测试
public class ByteArrayDemo {

	public static void main(String[] args) throws Exception {
		
		String tem = "abcdefghijk";
		byte[] bt = tem.getBytes();
		ByteArrayInputStream bis = new ByteArrayInputStream(bt);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		transform(bis, bos);
		byte[] result = bos.toByteArray();
		String str = new String(result);
		System.out.println(str);
	}
	//将小写字母转换为大写字母的方法
	public static void transform(InputStream in,OutputStream out)throws Exception {
		int c=0;
		while ((c=in.read())!=-1) {
			//先将c转换称字符，在大写，在转换称整形
			int C=(int)Character.toUpperCase((char)c);
			out.write(C);
		}
	}
}

