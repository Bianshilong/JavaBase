package com.bsl.java.common13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) {

		SimpleDateFormat sp1= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sp2= new SimpleDateFormat("yyyy年MM月dd日 hh点mm分ss秒");
		try {
			Date d = sp1.parse("2017-10-22 21:28:30");
			System.out.println(sp2.format(d));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
