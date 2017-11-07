package com.bsl.java.collection_16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@SuppressWarnings("all")
public class HashMapDemo {

	public static void main(String[] args) {
		//创建HashMap对象
		HashMap hm = new HashMap();
		//加入元素
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Barke", new Double(1378.00));
		hm.put("Todd Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		//返回包含key值的集合
		Set set = hm.entrySet();
		//用迭代器得到hashMap中的内容
		Iterator it = set.iterator();
		//散列映射并不保证它的元素的顺序
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey()+"---->"+me.getValue());
		}
		System.out.println();
		//给John Doe中的值增加1000
		double balance = ((double) hm.get("John Doe"));
		hm.put("John Doe", new Double(balance+1000));
		System.out.println("John Doe 现在的资金为:"+hm.get("John Doe"));
	}

}
