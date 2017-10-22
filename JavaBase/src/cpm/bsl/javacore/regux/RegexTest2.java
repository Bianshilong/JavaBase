package cpm.bsl.javacore.regux;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {

	public static void main(String[] args) {

		Matcher mc1 = Pattern.compile("t(a|oo)*n", Pattern.CASE_INSENSITIVE).
				matcher("atoonatoonbtancctn33");
		int groupCount =mc1.groupCount();
		while (mc1.find()) {
			for (int i = 0; i <=groupCount; i++) {
				System.out.println(mc1.group(i));
			}
			System.out.println("-----");
		}
	}

}
