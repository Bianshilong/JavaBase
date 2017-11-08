package com.bsl.java.enum_17;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
@SuppressWarnings("all")
public class EnumMapDemo {

	public static void main(String[] args) {
		//通过映射对枚举的支持
		EnumMap<Color,String> eMap = new EnumMap<>(Color.class);
		eMap.put(Color.RED, "红色");
		eMap.put(Color.GREEN, "绿色");
		eMap.put(Color.BLUE, "蓝色");
		for (Map.Entry<Color, String> me : eMap.entrySet()) {
			System.out.println(me.getKey()+"---->"+me.getValue());
		}
		System.out.println("------------------");
		//集合对枚举的支持
		//表示将全部的内容设置到集合
		EnumSet<Color> es = EnumSet.allOf(Color.class);
		Iterator it = es.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
