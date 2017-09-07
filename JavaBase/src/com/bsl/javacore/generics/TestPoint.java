package com.bsl.javacore.generics;

import java.util.Date;

public class TestPoint {
	public static void main(String[] args) {
		
		Point<Integer> point1 = new Point<Integer>(30, 50);
		point1.setY(point1.getY() + 30);
		point1.showInfo();
		
		Point <Double> point2 = new Point<Double>();
		point2.setX(3.78);
		point2.setY(6.987);
//		point2.getX();
//		point2.getY();
//		point2.setX(point2.getX());
//		point2.setY(point2.getY());
		point2.showInfo();
		
		/*Point <Date> pt3 = new Point <Date>();
		pt3.setX(new Date(88888));
		pt3.setY(new Date(99999));
		pt3.showInfo();*/        //若Point 中 T extends Number，则改行不可用！
		
	}
}
