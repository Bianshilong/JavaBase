package com.bsl.java.network22;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//Udp接收数据
public class UdpReceive {

	public static void main(String[] args) {
		
		DatagramSocket ds = null;
		byte[] buf = new byte[1024];
		DatagramPacket dp = null;
		//创建DatagramPacket时，要求的数据格式是byte型数组
		dp = new DatagramPacket(buf, 1024);
		 
		try {
			ds = new DatagramSocket(9000);
			ds.receive(dp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//调用String(byte[] bytes,int offset,int length)方法，将数组转换成字符串
		String str = new String(dp.getData(),0,dp.getLength())+" from "+
				dp.getAddress().getHostAddress()+":"+dp.getPort();
		System.out.println(str);
		ds.close();
	}

}
