package com.bsl.java.Object_common12;
//内部类可以访问外部类的属性，但外部类无法访问内部类中的属性。static声明的内部类不能访问非static的外部类属性
public class Outer {
	
	int score = 95;
	void inst(){
		Inner in = new Inner();
		in.dispaly();
	}
	class Inner{
		void dispaly(){
			System.out.println("普通内部类---->成绩:score="+score);
		}
	}
	
	void inn(final int s){
		int temp = 20;
		class Inner2{
			void display2(){
				System.out.println("方法中的内部类--->成绩:score="+(score+s+temp));
			}
		}
		Inner2 in2 = new Inner2();
		in2.display2();
	
	}
}
