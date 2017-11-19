package com.bsl.java.network22.tcp;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	public static void main(String[] args) throws Exception {
		//在8888端口上开启服务
		ServerSocket serverSocket = new ServerSocket(8888);
		//表示连接的客户端
		Socket clien = null;
		System.out.println("等嗲客户端连接......");
		//接受客户端的连接
		clien = serverSocket.accept();
		//得到客户端的输出流
		OutputStream out = clien.getOutputStream();
		PrintStream pout = new PrintStream(out);
		pout.println("Hello World!!!");
		pout.close();
		out.close();
		clien.close();
		serverSocket.close();
	}

}
