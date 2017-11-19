package com.bsl.java.network22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws Exception{

		Socket echoSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		echoSocket = new Socket("localhost", 1111);
		//获取服务器端的输出信息，自动缓冲
		out = new PrintWriter(echoSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		System.out.println(in.readLine());
		System.out.println(in.readLine());
		
		BufferedReader stdln = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		while ((userInput=stdln.readLine())!=null) {
			out.println(userInput);
			System.out.println(in.readLine());
		}
		out.close();
		in.close();
		echoSocket.close();
	}

}
