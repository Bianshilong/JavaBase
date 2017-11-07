package com.bsl.java.collection_16;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
@SuppressWarnings("all")
public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		tm.put(new Integer(10000-2000), "张三");
		tm.put(new Integer(10000-1500), "李四");
		tm.put(new Integer(10000-2500), "王五");
		tm.put(new Integer(10000-5000), "赵六");
		Collection col = tm.values();
		Iterator it = col.iterator();
		System.out.println("工资从高到低排序为：");
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}

}
