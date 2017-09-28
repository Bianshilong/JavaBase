package com.bsl.javacore.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<>();
		//增加数据
		list.add(22);
		list.add(44);
		list.add(33);
		list.add(55);
		list.add(66);
		
		System.out.println(list);
		//在首部增加
		list.addFirst(11);
		System.out.println(list);
		
		//在尾部增加
		list.addLast(88);
		System.out.println(list);
		
		System.out.println("list.getFirst()："+list.getFirst());
		System.out.println("list.getLast()："+list.getLast());
		
		System.out.println("list.peek():"+list.peek());   //得到list首元素，不删除首元素
		System.out.println(list);
		
		System.out.println("list.poll():"+list.poll());  //得到list首元素，同时删除首元素
		System.out.println(list);
		
		System.out.println("list.offer(99):"+list.offer(04));  //在list尾部添加元素
		
		System.out.println("list.offerFirst(11):"+list.offerFirst(11)); //在list首部添加元素
		System.out.println(list);
		
//		list.removeFirstOccurrence(list);
//		System.out.println("list.removeFirstOccurrence(list):"+list.removeFirstOccurrence(list));
//		System.out.println(list);
		
		System.out.println("list.element():"+list.element());  //返回但不删除首元素，如果遇到list为空，会报异常
		System.out.println(list);
		
		System.out.println("list.contains(10):"+list.contains(10));
		System.out.println("list.contains(44):"+list.contains(44));
		
		System.out.println("list.set(4, 35):"+list.set(4, 35));
		System.out.println(list);
		
		
		
	}

}
