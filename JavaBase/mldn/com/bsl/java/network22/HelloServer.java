package com.bsl.java.network22;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//Socket是客户端或服务器端的一个特殊的对象，服务器端代码实现
public class HelloServer {
	
	public static void main(String[] args) throws Exception{
		
		//实例化了一个服务器端的Socket连接
		ServerSocket sst = new ServerSocket(9999);
		//accept()方法用来监视客户端的连接
		Socket clientsocket = sst.accept();
		PrintWriter out = null;
		out = new PrintWriter(clientsocket.getOutputStream(),true);
		out.println("hello world");
		clientsocket.close();
		sst.close();
		
	}
}
