package com.bsl.java.enum_17;

public class TestColor {

	public static void main(String[] args) {
		
		Color cl = Color.RED;
		System.out.println(cl);
		
		//在Switch语句中使用枚举
		switch (Color.RED) {
		case RED:
			System.out.println("红色！");
			break;
		case BLUE:
			System.out.println("蓝色！");
			break;
		case GREEN:
			System.out.println("绿色！");
			break;

		default:
			break;
		}
		System.out.println("遍历枚举类中的元素");
		for (Color c : Color.values()) {
			System.out.print(c+"\t");
			System.out.println(c.name()+"--->"+c.ordinal());
		}
		//valueOf()方法的使用
		System.out.println(Color.valueOf(Color.class,"RED"));
	}

}
