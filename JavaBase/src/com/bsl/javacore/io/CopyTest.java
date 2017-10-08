package com.bsl.javacore.io;

import java.awt.image.ByteLookupTable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//拷贝大文件
public class CopyTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("等待5s中...");
		Thread.sleep(5000);
		useBufferedCopyFile();
		

	}

	public static void useBufferedCopyFile() throws IOException {
		FileInputStream fis = new FileInputStream("fanshe.wmv");
		FileOutputStream fos = new FileOutputStream("fanshe_bk.wmv");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		byte[] unit = new byte[16384];
		long start = System.currentTimeMillis();

		System.out.println("现在开始的时间是：" + start + "ms");
		while (bis.available() > 0) {
			if (bis.available() >= 16384) {
				bis.read(unit);
				bos.write(unit);
			} else {
				System.out.println("剩余的字节不足16384，剩余为：" + bis.available());
				byte[] unit1 = new byte[bis.available()];
				bis.read(unit);
				bos.write(unit1);
			}
		}
		bis.close();
		bos.close();
		
		long end =System.currentTimeMillis();
		long use;
		use=end - start;
		System.out.println("本次拷贝用时："+use+"ms");
	}
}
