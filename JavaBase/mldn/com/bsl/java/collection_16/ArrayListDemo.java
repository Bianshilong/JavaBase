package com.bsl.java.collection_16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
@SuppressWarnings("all")
public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		System.out.println("al的初始化大小为："+al.size());
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println("加入元素后al的大小为："+al.size());
		System.out.println("al的内容为："+al);
		al.add(1,"A2");
		System.out.println("修改后al的内容为："+al);
		al.remove("F");
		al.remove(2);
		System.out.println("删除元素后al的大小为："+al.size());
		System.out.println("删除元素后al的内容为："+al);
		//通过迭代访问集合中的元素
		System.out.println("使用迭代器迭代集合中的元素");
		System.out.println("al中的原始内容是：");
		Iterator iter1 = al.iterator();
		while (iter1.hasNext()) {
			String str = (String) iter1.next();
			System.out.print(str+"\t");
		}
		System.out.println();
		System.out.println("---------------");
		//使用ListIterator修改内容
		ListIterator lsi = al.listIterator();
		while (lsi.hasNext()) {
			Object object = (Object) lsi.next();
			lsi.set(object+"2");
		}
		System.out.println("al被修改后的内容为：");
		iter1=al.iterator();
		while (iter1.hasNext()) {
			String str = (String) iter1.next();
			System.out.print(str+"\t");
		}
		System.out.println();
		System.out.println("---------------");
		//反向输出集合，ListIterator对象的hasPrevious()方法
		System.out.println("反向输出集合：");
		while (lsi.hasPrevious()) {
			String str = (String) lsi.previous();
			System.out.print(str+"\t");
		}
		System.out.println();
	}

}
