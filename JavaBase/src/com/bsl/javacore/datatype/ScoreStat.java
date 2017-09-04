package com.bsl.javacore.datatype;
import java.util.Scanner;
public class ScoreStat {
	public static void main(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("STB的成绩是：");
		int stb = input.nextInt();	
		System.out.println("JAVA的成绩是：");
		int java = input.nextInt();
		System.out.println("PHP的成绩是：");
		int php = input.nextInt();
	}
}
