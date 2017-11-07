package com.bsl.java.collection_16;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
@SuppressWarnings("all")
//Properties类的使用
public class PropertiesDemo {

	public static void main(String[] args) {
		
		Properties capitals = new Properties();
		capitals.put("中国", "北京");
		capitals.put("俄罗斯", "莫斯科");
		capitals.put("日本", "东京");
		capitals.put("法国", "巴黎");
		capitals.put("英国", "伦敦");
		Set state = capitals.keySet();
		Iterator it = state.iterator();
		while (it.hasNext()) {
			String obj = (String) it.next();
			System.out.println("国家："+obj+"首都："+capitals.getProperty(obj));
		}
		System.out.println("-----------");
		System.out.println("设置前------>");
		String str = capitals.getProperty("美国");
		System.out.println("美国的首都："+str);
		
		System.out.println("设置后------>");
		capitals.setProperty("美国","华盛顿");
		String str1 = capitals.getProperty("美国");
		System.out.println("美国的首都："+str1);
	}

}
