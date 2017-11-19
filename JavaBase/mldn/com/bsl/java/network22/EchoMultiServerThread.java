package com.bsl.java.network22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//服务器端实现多线程，服务器就可以同时处理多个客户端请求
public class EchoMultiServerThread extends Thread {

	private Socket socket = null;

	public EchoMultiServerThread(Socket socket) {
		super("EchoMultiServerThread");
		// 声明一个socket对象
		this.socket = socket;
	}

	public void run() {
		try {
			PrintWriter out = null;
			BufferedReader in = null;
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out.println("Hello...");
			out.println("Enter BYE to exit");
			out.flush();
			// 在没有异常的情况下，不断循环
			while (true) {
				// 只有当用户输入数据时才返回数据内容
				String str = in.readLine();
				// 当用户连接断掉时，会返回值null
				if (str == null) {
					break;
				} else {
					// 对用户输入字串加前缀Echo，将此信息打印至客户端
					out.println("Echo:" + str);
					out.flush();
					// 退出命令，equalsIgnoreCase()是不区分大小写的比较
					if (str.trim().equalsIgnoreCase("BYE")) {
						break;
					}
				}
			}
			out.close();
			in.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
