package com.bsl.java.io20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//数据输入输出流
public class DataStreamDemo {

	public static void main(String[] args) throws Exception{
		//创建一个新的文件，用来存储数据
		File file = new File("order.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		//定义数据
		double[] prices = {18.99,9.22,14.22,5.22,4.21};
		int[] units = {10,10,20,39,40};
		String[] descs = {"T恤衫","杯子","洋娃娃","大头针","钥匙链"};
		for (int i = 0; i < prices.length; i++) {
			dos.writeDouble(prices[i]);
			dos.writeChar('\t');
			dos.writeInt(units[i]);
			dos.writeChar('\t');
			dos.writeChars(descs[i]);
			dos.writeChar('\n');
		}
		dos.close();
		//将数据读出
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		double price;
		int unit;
		StringBuffer desc;
		double total=0.0;
			try {
				//当文本被全部读出，会抛出EOFException异常，中断循环
				while (true) {
					//读出价格
					price=dis.readDouble();
					//跳过tab
					dis.readChar();
					unit=dis.readInt();
					dis.readChar();
					char chr;
					desc=new StringBuffer();
					while ((chr=dis.readChar())!='\n') {
						desc.append(chr);
					}
					System.out.println("订单信息："+"产品名称："+desc+",\t数量："+unit+",\t价格："+price);
					total=total+unit*price;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("\n总共需要："+total+"元");
			}
		dis.close();
	}
}

