package com.bsl.java.enum_17;
//实现Info接口的实现类
public enum Colr implements Info {
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
}
