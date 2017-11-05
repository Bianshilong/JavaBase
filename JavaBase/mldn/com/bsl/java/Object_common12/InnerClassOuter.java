package com.bsl.java.Object_common12;

public class InnerClassOuter {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.inst();
		//用外部类的对象去实例化了一个内部类的对象
		Outer.Inner in = out.new Inner();
		in.dispaly();
		Outer out2 = new Outer();
		out2.inn(12);
	}

}
