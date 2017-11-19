package com.bsl.java.network22;

import java.io.IOException;
import java.net.ServerSocket;

//多线程服务器端程序编写
public class EchoServerThread {

	public static void main(String[] args) throws IOException {

		//声明一个serverSocket
		ServerSocket serverSocket=null;
		//声明一个监听标志
		boolean listening = true;
		serverSocket = new ServerSocket(1111);
		//如果处于监听状态，则开启一个线程
		while (listening) {
			//实例化一个服务端的socket与请求socket建立联系
			new EchoMultiServerThread(serverSocket.accept()).start();
		}
		//将serverSocket的关闭操作放在循环外
		//只有当监听状态为false时，服务才关闭
		serverSocket.close();
	}

}
