package com.bsl.java.network22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//Echo服务器端程序编写
public class EchoServer {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		//实例化监听端口
		try {
			serverSocket = new ServerSocket(1111);
		} catch (IOException e) {
			System.out.println("Could not listen on port:1111");
			System.exit(1);
		}
		Socket incoming = null;
		while (true) {
			incoming = serverSocket.accept();
			out = new PrintWriter(incoming.getOutputStream(),true);
			//将字节流放入字符流缓冲之中
			in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
			//提示信息：
			out.println("Hello...");
			out.println("Enter BYE to exit");
			out.flush();
				//在没有异常的情况下，不断循环
				while (true) {
					//只有当用户输入数据时才返回数据内容
					String str = in.readLine();
					//当用户连接断掉时，会返回值null
					if (str==null) {
						break;
					}else{
						//对用户输入字串加前缀Echo，将此信息打印至客户端
						out.println("Echo:"+str);
						out.flush();
						//退出命令，equalsIgnoreCase()是不区分大小写的比较
						if (str.trim().equalsIgnoreCase("BYE")) {
							break;
						}
					}
				}
				out.close();
				in.close();
				incoming.close();
				serverSocket.close();
		}
	}
}
