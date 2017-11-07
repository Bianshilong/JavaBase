package com.bsl.java.collection_16;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
@SuppressWarnings("all")
public class TreeMapDemo2 {

	public static void main(String[] args) {
		
		TreeMap ts = new TreeMap(new MyComp());
		ts.put("Z、张三", new Double(3534.34));
		ts.put("L、李四", new Double(126.22));
		ts.put("W、王五", new Double(1578.40));
		ts.put("Z、赵六", new Double(99.22));
		ts.put("S、孙七", new Double(-29.08));
		Set st = ts.entrySet();
		Iterator it = st.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey()+"---->"+me.getValue());
		}
		System.out.println("-------");
		double balance = (double) ts.get("Z、张三");
		ts.put("Z、张三", new Double(balance+1000));
		System.out.println("张三最新的资金为："+ts.get("Z、张三"));
		
	}

}
