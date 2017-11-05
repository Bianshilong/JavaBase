package com.bsl.java.Object_common12;
//返回一个新的二维数组
public class TestJavaFanerwei {
	public static void main(String[] args) {
		
		int[][] A = {{51,38,82,12,34},{72,84,19,31}};
		int[][] B = new int[2][5];
		B=add(A, 10);
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	public static int[][] add(int arr[][],int n){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]+=n;
			}
		}
		return arr;
	}
}
