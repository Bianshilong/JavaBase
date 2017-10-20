package cpm.bsl.javacore.regux;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo {

	public static void main(String[] args) {
		System.out.println("-----first------");
		String str = "anhui province hefei city";
		String city = ".*hefei.*";
		boolean ismatch = Pattern.matches(city, str);
		System.out.println("str中是否包含city:" + ismatch);

		System.out.println("-----second------");
		String content = "I am noob from runoob.com.";
		String pattern = ".*runoob.*";
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
		
		System.out.println("-----third------");
		String url="www.163.com";
		String sp="(\\D*)(\\.)(\\d+)(\\.)(\\D*)";
		//通过Pattern类的compile()方法创建一个Pattern对象
		Pattern p = Pattern.compile(sp);
		//通过Matcher类的matcher()方法创建一个Matcher对象
		Matcher m = p.matcher(url);
		System.out.println("组的个数为："+m.groupCount());
		if (m.find()) {
			System.out.println("Found Value: "+m.group(0));
			System.out.println("Found Value: "+m.group(1));
			System.out.println("Found Value: "+m.group(2));
			System.out.println("Found Value: "+m.group(3));
			System.out.println("Found Value: "+m.group(4));
			System.out.println("Found Value: "+m.group(5));
		}else {
			System.out.println("No match");
		}
		
		System.out.println("-----forth------");
	      // 按指定模式在字符串查找
	      String line = "This order was placed for QT3000! OK?";
	      String pat = "(\\D*)(\\d+)(.*)";
	 
	      // 创建 Pattern 对象
	      Pattern r = Pattern.compile(pat);
	 
	      // 现在创建 matcher 对象
	      Matcher mt = r.matcher(line);
	      if (mt.find( )) {
	         System.out.println("Found value: " + mt.group(0) );
	         System.out.println("Found value: " + mt.group(1) );
	         System.out.println("Found value: " + mt.group(2) );
	         System.out.println("Found value: " + mt.group(3) ); 
	      } else {
	         System.out.println("NO MATCH");
	      }
		
	      System.out.println("-------fifth--------");
	      String str1 = "yz";
	      String str2 = "[^x]*";
	      Pattern pt =Pattern.compile(str2);
	      Matcher m2=pt.matcher(str1);
		  System.out.println(m2.matches());
	}
}
