package com.bsl.java.collection_16;

import java.util.LinkedList;
@SuppressWarnings("all")
public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList al = new LinkedList();
		al.add("C");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println("al的内容为："+al);
		al.addLast("Z");
		al.addFirst("A");
		al.add(1,"A2");
		System.out.println("修改后al的内容为："+al);
		al.remove("F");
		al.remove(2);				
		System.out.println("删除元素后al的内容为："+al);
		System.out.println("删除元素后al的大小为："+al.size());
		al.removeLast();
		al.removeFirst();
		System.out.println("删除第一个和最后一个元素后al的内容为："+al);
		//使用set方法为下标为2的元素赋值
		al.set(2, "change");
		System.out.println("改变后的al:"+al);	
		
		
	}

}
