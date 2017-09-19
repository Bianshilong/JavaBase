package com.bsl.javacore.TestJava8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class StreamDemo {
	public static void main(String[] args) {
		/*
		 * 在 Java 8 中, 集合接口有两个方法来生成流： stream() − 为集合创建串行流。 parallelStream() − 为集合创建并行流。
		 */
		// filter 方法用于通过设置的条件过滤出元素
		List<String> list = Arrays.asList("asdl", "", "des", "sd", "deht", "t", "", "wes");
		System.out.println("原来的list：");
		System.out.println(list);
		List<String> filtered = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("过滤后的list");
		System.out.println(filtered);
		long count = list.stream().filter(string -> string.isEmpty()).count();
		System.out.println("list中有" + count + "空串.");

		// 使用并列程序
		long count1 = list.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println("list中有" + count1 + "空串.");

		// 合并字符串，去除空串
		String mergedlist = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining("+"));
		System.out.println("合并后的字符串为：" + mergedlist);
		
		//合并字符串，不去除空串
		String mergedlist1 = list.stream().collect(Collectors.joining("+"));
		System.out.println("合并后的字符串为：" + mergedlist1);
		

		// 使用 forEach 输出了10个随机数,limit 方法用于获取指定数量的流
		Random random = new Random();
		System.out.println("随机输出10个数：");
		random.ints().limit(10).forEach(System.out::println);

		// 使用 sorted 方法对输出的 10 个随机数进行排序：
		System.out.println("对随机输出的10个数进行排序：");
		random.ints().limit(10).sorted().forEach(System.out::println);

		// 使用 map 输出了元素对应的平方数：
		List<Integer> numbers = Arrays.asList(3, 2, 2, 5, 7, 6, 4, 8, 5);
		System.out.println("输出对应的元素：");
		System.out.println(numbers);
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList()); // 去重复
		List<Integer> squaresList1 = numbers.stream().map(i -> i * i).collect(Collectors.toList()); // 不去重复
		System.out.println("输出对应的平方数，去除重复的数据：");
		System.out.println(squaresList);
		System.out.println("输出对应的平方数，不去除重复的数据：");
		System.out.println(squaresList1);
		
		//统计结果收集器
		IntSummaryStatistics stats =numbers.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("列表中最大的数为："+stats.getMax());
		System.out.println("列表中最小的数为："+stats.getMin());
		System.out.println("所有数之和为："+stats.getSum());
		System.out.println("平均数为："+stats.getAverage());
		

	}

}
