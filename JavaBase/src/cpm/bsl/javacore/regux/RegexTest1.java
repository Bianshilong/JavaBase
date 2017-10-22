package cpm.bsl.javacore.regux;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexTest1 {

	public static void main(String[] args) {

		String str = "\\bcat\\b";
		String ipt = "cat cat cat cattie cat";
		int count = 0;
		
		Pattern pt = Pattern.compile(str);
		Matcher mc = pt.matcher(ipt);
		while (mc.find()) {
			count++;
			System.out.print("Match Number："+count+"\t");
			System.out.print("Start："+mc.start()+"\t");
			System.out.println("End："+mc.end()+"\t");
		}
		System.out.println("--------------------");
		String str1 = "too";
		String ipt1 = "toooooo";
		Pattern pt1 = Pattern.compile(str1);
		Matcher mc1 = pt1.matcher(ipt1);
		//查找匹配的字符串是够包含在输出的字符串中
		System.out.println("mc1.lookingAt():"+mc1.lookingAt());
		//匹配的字符串与输入的字符串是否全匹配
		System.out.println("mc.matches()："+mc.matches());
		
		System.out.println("---------------------");
		String str2 = "dog";
		String ipt2 = "The dog say hello,all dogs say hello";
		String rep = "cat";
		Pattern pt2 = Pattern.compile(str2);
		Matcher mc2 = pt2.matcher(ipt2);
		String newipt2=mc2.replaceAll(rep);
		String newipt3 = mc2.replaceFirst(rep);
		System.out.println("mc2.replaceAll(rep)："+newipt2);
		System.out.println("mc2.replaceFirst(rep)："+newipt3);
		
		System.out.println("--------------");
		String str3 = "a*b";
		String ipt3 = "aabfooabfooaaabfoob";
		String rep1 = "-";
		Pattern pt3 = Pattern.compile(str3);
		Matcher mc3 = pt3.matcher(ipt3);
		StringBuffer nipt3 = new StringBuffer();
		while (mc3.find()) {
			mc3.appendReplacement(nipt3, rep1);
		}
		//两种方式
		System.out.println(nipt3.toString());
		System.out.println(mc3.appendTail(nipt3));
	}

}
