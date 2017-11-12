package com.bsl.java.io_20;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeStreamDemo {

	public static void main(String[] args) throws Exception {

		Sender send = new Sender();
		Receiver receiver = new Receiver();
		PipedOutputStream out = send.getOutputStream();
		PipedInputStream in = receiver.getInputStream();
		out.connect(in);
		new Thread(send).start();
		new Thread(receiver).start();
	}

}

class Sender implements Runnable{
	private PipedOutputStream out = new PipedOutputStream();
	
	public PipedOutputStream getOutputStream(){
		return out;
	}
	
	public void run(){
		String s = new String("Recviver，你好！");
		try {
			out.write(s.getBytes());
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Receiver implements Runnable{
	
	private PipedInputStream in = new PipedInputStream();
	public PipedInputStream getInputStream() {
		return in;
	}
	public void run() {
		
		String str;
		byte[] buf = new byte[1024];
		try {
			int len = in.read(buf);
			str=new String(buf, 0, len);
			System.out.println("收到了以下信息："+str);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}