package com.bsl.java.enum_17;
//在枚举类中定义抽象方法
public enum Colr2 {
	RED{
		public String getColr() {
			return "红色";
		}
	},
	BLUE{
		public String getColr() {
			return "蓝色";
		}
	},
	WHITE{
		public String getColr() {
			return "白色";
		}
	};
	//在枚举中定义抽象方法
		public abstract String getColr(); 
}
