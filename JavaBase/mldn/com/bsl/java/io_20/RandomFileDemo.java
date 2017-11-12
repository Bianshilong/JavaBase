package com.bsl.java.io_20;

import java.io.RandomAccessFile;

public class RandomFileDemo {

	public static void main(String[] args) throws Exception {
		
		Employee e1 = new Employee("zhangsan", 27);
		Employee e2 = new Employee("lisi", 30);
		Employee e3 = new Employee("wangxiaoer", 35);
		RandomAccessFile ra = new RandomAccessFile("C:\\2.txt","rw");
		
		ra.write(e1.name.getBytes());
		ra.writeInt(e1.age);
		ra.write(e2.name.getBytes());
		ra.writeInt(e2.age);
		ra.write(e3.name.getBytes());
		ra.writeInt(e3.age);
		ra.close();
		
		RandomAccessFile raf = new RandomAccessFile("C:\\2.txt", "r");
		int len = 8;
		raf.skipBytes(12);
		System.out.println("第二个员工信息：");
		String str = "";
		for (int i = 0; i < len; i++) {
			str = str+(char)raf.readByte();
		}
		System.out.println("name:"+str);
		System.out.println("age:"+raf.readInt());
		
		System.out.println("第一个员工信息：");
		raf.seek(0);
		str = "";
		for (int i = 0; i < len; i++) {
			str = str+(char)raf.readByte();
		}
		System.out.println("name:"+str);
		System.out.println("age:"+raf.readInt());
		
		System.out.println("第三个员工信息：");
		raf.skipBytes(12);
		str = "";
		for (int i = 0; i < len; i++) {
			str = str+(char)raf.readByte();
		}
		System.out.println("name:"+str);
		System.out.println("age:"+raf.readInt());
		raf.close();
	}

}

class Employee{
	
	String name;
	int age;
	final static int len = 8;
	public Employee(String name,int age){
		if (name.length()>len) {
			name = name.substring(0, 8);
		}else{
			while (name.length()<len) {
				name = name +"\u0000";
			}
		}
		this.name=name;
		this.age=age;
	}
}