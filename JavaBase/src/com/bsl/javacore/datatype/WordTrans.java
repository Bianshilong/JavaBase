package com.bsl.javacore.datatype;

public class WordTrans {
	
	private int day;
	private int month;
	private int year;
	
	public void display(int day, int month, int year){
		day = 18;
		month = 4;
		year = 2013;
		System.out.print("传输中的数值为：" + year + " " + month + " " + day);
	}
	
	public void display(WordTrans wordtrans){
		wordtrans.day = 15;
		wordtrans.month = 9;
		wordtrans.year = 2015;
		System.out.print("传输中的数值为：" + wordtrans.year + " " + wordtrans.month + " " + wordtrans.day);
	}
	
	public static void TestValue1(){
		WordTrans wordtrans = new WordTrans();
		int day = 29, month = 5, year = 2016;
		System.out.println("传递之前的值：" + year + " " + month + " " + day);
		wordtrans.display(year,month,day);
		System.out.println("传递之后的值：" + year + " " + month + " " + day);
	}

}
