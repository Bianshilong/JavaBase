package com.bsl.javacore.test;

import org.apache.log4j.Logger;

public class Test2 {
	
	private Logger logger =Logger .getLogger(this.getClass());
	
	public void TestLog4j(){
		logger.debug("这是debug级别的信息...");
		logger.info("这是info级别的信息...");
		logger.warn("这是warn级别的信息...");
	}
	public static void main(String[] args) {
		
		Test2 test2 =new Test2();
		test2.TestLog4j();
	}

}
