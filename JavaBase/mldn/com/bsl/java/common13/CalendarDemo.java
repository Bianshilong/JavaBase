package com.bsl.java.common13;

import java.util.Calendar;

public class CalendarDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.get(Calendar.YEAR)+"年"+c1.get(c1.MONTH)+"月"
				+c1.get(c1.DAY_OF_MONTH)+"日"+c1.get(c1.HOUR)+":"
				+c1.get(c1.MINUTE)+":"+c1.get(c1.SECOND));
//		//System.out.println(c1.get(c1.YEAR)+"年"+c1.get(c1.MONTH)+"月"
//				+c1.get(c1.DATE)+"日"+c1.get(c1.HOUR)+":"
//				+c1.get(c1.MINUTE)+":"+c1.get(c1.SECOND));
		
		c1.add(c1.DAY_OF_MONTH, 230); 
//		c1.add(c1.DATE, 230);  与上面效果一样
		
		System.out.println(c1.get(c1.YEAR)+"年"+c1.get(c1.MONTH)+"月"
				+c1.get(c1.DAY_OF_MONTH)+"日"+c1.get(c1.HOUR)+":"
				+c1.get(c1.MINUTE)+":"+c1.get(c1.SECOND));
		
	}

}
