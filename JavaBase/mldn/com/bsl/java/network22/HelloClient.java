package com.bsl.java.network22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

//将服务器端内容读取，在控制台打印
public class HelloClient {

	public static void main(String[] args) throws Exception {
		//客户端接收
		Socket clientss = null;
		BufferedReader bf = null;
		//将输入输出流与Socket关联
		clientss = new Socket("localhost", 9999);
		bf = new BufferedReader(new InputStreamReader(clientss.getInputStream()));
		System.out.println(bf.readLine());
		bf.close();
		clientss.close();
		
		
	}

}
