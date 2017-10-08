package com.bsl.javacore.io;

import java.io.File;
import java.util.Date;

//File类
public class FileDemo {

	public static void main(String[] args) {
		File f1 = new File("a.jpg");
		File f2 = new File("D:/temp/");

		System.out.println("Name:" + f1.getName());
		System.out.println("Path:" + f1.getPath());
		System.out.println("AbsolutePath:" + f1.getAbsolutePath());
		System.out.println("Parent:" + f1.getParent());
		System.out.println("lastModified:" + new Date(f1.lastModified()));
		System.out.println("length:" + f1.length());
		System.out.println("exists:" + f1.exists());
		System.out.println("canRead:" + f1.canRead());
		System.out.println("canWrite:" + f1.canWrite());
		System.out.println("isFile:" + f1.isFile());
		System.out.println("isHidden:" + f1.isHidden());
		System.out.println("isDirectory:" + f1.isDirectory());
		System.out.println("isAbsolute:" + f1.isAbsolute());
		System.out.println("length:" + f1.length());
		System.out.println(f1.delete());

		System.out.println("-------------------------");

		System.out.println("Name:" + f2.getName());
		System.out.println("Path:" + f2.getPath());
		System.out.println("AbsolutePath:" + f2.getAbsolutePath());
		System.out.println("Parent:" + f2.getParent());
		System.out.println("lastModified:" + new Date(f2.lastModified()));
		System.out.println("length:" + f2.length());
		System.out.println("exists:" + f2.exists());
		System.out.println("canRead:" + f2.canRead());
		System.out.println("canWrite:" + f2.canWrite());
		System.out.println("isFile:" + f2.isFile());
		System.out.println("isHidden:" + f2.isHidden());
		System.out.println("isDirectory:" + f2.isDirectory());
		System.out.println("isAbsolute:" + f2.isAbsolute());
		System.out.println("length:" + f2.length());
//		System.out.println(f2.delete());

	}
}
