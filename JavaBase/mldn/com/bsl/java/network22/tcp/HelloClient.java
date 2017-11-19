package com.bsl.java.network22.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

//客户端程序编写代码
public class HelloClient {

	public static void main(String[] args) throws Exception {
		//表示连接的主机及端口
		Socket client = new Socket("localhost", 8888);
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String str = buf.readLine();
		System.out.println("内容是："+str);
		client.close();
	}

}
