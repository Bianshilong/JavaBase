package com.bsl.java.io20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//实现序列化和反序列化的类
public class SerializableDemo {

	public static void main(String[] args) throws Exception{
		//创建一个文件，用来保存序列化的对象
		File f = new File("SerializablePerson");
		//调用序列化与反序列化的静态方法
		serialize(f);
		deserialize(f);
	}
	
	//实现序列化对象的方法
	public static void serialize(File f) throws Exception{
		
		OutputStream outfile = new FileOutputStream(f);
		ObjectOutputStream oout = new ObjectOutputStream(outfile);
		oout.writeObject(new Person("张三", 25));
		oout.close();
	}
	
	//实现反序列化的方法
	public static void deserialize(File f)throws Exception{
		InputStream infile = new FileInputStream(f);
		ObjectInputStream oinst = new ObjectInputStream(infile);
		Person p = (Person) oinst.readObject();
		System.out.println(p);
		
		
		
	}
}
