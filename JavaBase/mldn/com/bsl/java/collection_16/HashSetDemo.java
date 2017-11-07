package com.bsl.java.collection_16;

import java.util.HashSet;
import java.util.TreeSet;

@SuppressWarnings("all")
public class HashSetDemo {

	public static void main(String[] args) {
		//hashSet是随机排列
		HashSet al = new HashSet();
		System.out.println("al的初始化大小为："+al.size());
		al.add("S");
		al.add("A");
		al.add("L");
		al.add("B");
		al.add("K");
		al.add("R");
		System.out.println("加入元素后al的大小为："+al.size());
		System.out.println("al的内容为："+al);
		al.remove("K");
		System.out.println("删除元素后al的大小为："+al.size());
		System.out.println("删除元素后al的内容为："+al);
		
		//TreeSet是升序排列
		TreeSet bl = new TreeSet();
		System.out.println("al的初始化大小为："+bl.size());
		bl.add("G");
		bl.add("A");
		bl.add("O");
		bl.add("X");
		bl.add("H");
		bl.add("Q");
		System.out.println("加入元素后bl的大小为："+bl.size());
		System.out.println("bl的内容为："+bl);
		bl.remove("X");
		System.out.println("删除元素后bl的大小为："+bl.size());
		System.out.println("删除元素后bl的内容为："+bl);
		
		
	}

}
