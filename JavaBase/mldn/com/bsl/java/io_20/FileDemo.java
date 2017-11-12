package com.bsl.java.io_20;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\1.txt");
		if (file.exists()) {
			file.delete();
		}else{
			file.createNewFile();
			//取得文件名
			System.out.println("文件名："+file.getName());
			System.out.println("文件路径："+file.getPath());
			System.out.println("文件的绝对路径:"+file.getAbsolutePath());
			System.out.println("父文件名："+file.getParent());
			System.out.println(file.exists()?"文件存在":"文件不存在");
			System.out.println(file.canWrite()?"文件可写":"文件不可写");
			System.out.println(file.canRead()?"文件可读":"文件不可读");
			System.out.println(file.isDirectory()?"是":"不是"+"目录");
			System.out.println(file.isFile()?"是文件":"不是文件");
			System.out.println(file.isAbsolute()?"是绝对路径":"不是绝对路径");
			System.out.println("最后修改时间"+file.lastModified());
			System.out.println("文件大小："+file.length()+"Bytes");
			
		}
	}

}
