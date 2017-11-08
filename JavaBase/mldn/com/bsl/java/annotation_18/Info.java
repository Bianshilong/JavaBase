package com.bsl.java.annotation_18;

public class Info {
	@SuppressWarnings(value="ss")
	@Deprecated
	@Override
	@MyAnnotation(key="MLDN",value="www.mldnjava.com")
	public String toString() {
		return "hello";
	}
}
