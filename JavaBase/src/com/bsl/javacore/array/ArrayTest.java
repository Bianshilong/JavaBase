package com.bsl.javacore.array;
//在控制台显示5件特价商品的名称
public class ArrayTest {
	public static void main(String[] args) {
		String[] goods;
		goods = new String [5];
		goods[0] = "Nike背包";
		goods[1] = "Adidas运动衫";
		goods[2] = "李宁运动鞋";
		goods[3] = "Kappa外套";
		goods[4] = "361°腰包";
		System.out.println("本次活动特价商品有：");
		for(int i =0;i<5;i++) {
			System.out.println(goods[i]);
		}
				
	}
}
