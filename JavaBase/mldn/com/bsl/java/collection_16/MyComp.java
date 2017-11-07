package com.bsl.java.collection_16;

import java.util.Comparator;
@SuppressWarnings("all")
public class MyComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int k;
		String str1,str2;
		str1=(String) o1;
		str2=(String) o2;
		k=str1.compareTo(str2);				//正序输出
//		return str2.compareTo(str1);		//反序输出
		if(k==0){
			return str1.compareTo(str2);
		}else{
			return k;
		}  
	}
}
