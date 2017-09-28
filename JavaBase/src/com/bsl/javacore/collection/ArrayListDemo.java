package com.bsl.javacore.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		// List<String> list =new ArrayList<String>(); 使用接口方式
		ArrayList<String> list = new ArrayList<String>();
		// 添加内容
		list.add("我");
		list.add("是");
		list.add("一");
		list.add("个");
		list.add("好");
		list.add("人");
		list.add("人");
		// 使用foreach输出list
		System.out.println("list的内容为：");
		for (String string : list) {
			System.out.println(string);
		}

		// 增加内容
		list.add(0, "其");
		list.add(1, "实");

		// 使用迭代器输出
		System.out.println("增加内容后的list为：");
		Iterator<String> lIterator = list.iterator();
		while (lIterator.hasNext()) {
			String string = (String) lIterator.next();
			System.out.println(string);
		}

		System.out.println("list.get(0):" + list.get(0));
		System.out.println("list.size():"+list.size());
		
		//通过for循环得到对应下标的list值：
		System.out.println("对应下标的值为：");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list.get("+i+"):"+list.get(i));
		}
		
		//删除元素
		list.remove(2);
		System.out.println("删除数据后的list为：");
		Iterator<String> lIterator2=list.iterator();
		while (lIterator2.hasNext()) {
			String string = (String) lIterator2.next();
			System.out.println(string);
		}
		
		//判断是否包含
		
		System.out.println(list.contains("我"));
		if (!list.contains("我")) {
			System.out.println("不包含'我'");
		}
		
		//判断是否为空
		if (!list.isEmpty()) {
			System.out.println("list不为空！");
		}
		
		list.remove("一");
		System.out.println("删除'一'后的list：");
		Iterator<String> lIterator3=list.iterator();
		while (lIterator3.hasNext()) {
			String string = (String) lIterator3.next();
			System.out.println(string);
		}
		
		System.out.println("list.indexof('是'):"+list.indexOf("是"));
		System.out.println("list.lastIndexOf('人'):"+list.lastIndexOf("人"));
		
		System.out.println("list :"+list);
		System.out.println("list.subList(2, 6):"+list.subList(2, 6));
		
		List<String> list2 =list.subList(2, 6);
		System.out.println("list.containsAll(list2):"+list.containsAll(list2));
		
		list2.add("OK");
		list2.add(0, "我");
		System.out.println("list2:"+list2);
		System.out.println("list"+list);
		System.out.println("list.containsAll(list2):"+list.containsAll(list2));
		
//		list.removeAll(list);
//		list.clear();
//		System.out.println(list.size());
//		System.out.println(list.set(0, "我"));
//		System.out.println(list);
		list.retainAll(list2);
		System.out.println(list);
		
	
	}
}
