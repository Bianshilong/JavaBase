package com.bsl.java.lesson10;
//子类对象的实例化
public class TestPersonStudentDemo {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setName("zhangsan");
		st.setAge(25);
		st.school_name="安大";
		st.talk();
		System.out.println("姓名:"+st.getName()+",今年:"+st.getAge()+"岁");
	}

}
