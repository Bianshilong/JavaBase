package cpm.bsl.javacore.regux;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//从文件中读取文本，在此过程中，将文本的部分内容修改，然后写入到新的文本中，如何实现？

public class RegexTest3 {

	public static void main(String[] args) throws IOException{

		File f1 = new File("dog.txt");
		
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(new File("cat.txt"));
		int read =fis.read();
		while (read!=-1) {
			fos.write(read);
			read=fis.read();
		}
		fis.close();
		fos.close();
	}

}
