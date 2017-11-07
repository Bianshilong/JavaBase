package com.bsl.java.collection_16;

import java.util.Iterator;
import java.util.TreeSet;
@SuppressWarnings("all")
public class ComparatorToDemo {

	public static void main(String[] args) {
		//comparator the comparator that will be used to order this set. 
		//If null, the natural ordering of the elements will be used.
		TreeSet ts = new TreeSet(new MyComp());
		//TreeSet ts = new TreeSet();  //无参数，自然排序，为从小往大，正序
		ts.add("C");
		ts.add("J");
		ts.add("S");
		ts.add("Y");
		ts.add("P");
		ts.add("F");
		Iterator it = ts.iterator();
		System.out.println("输入集合内容：");
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.print(str+"\t");
		}
		System.out.println();
	}

}
