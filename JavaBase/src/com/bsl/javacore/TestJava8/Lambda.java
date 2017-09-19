package com.bsl.javacore.TestJava8;

public class Lambda {

	public static void main(String[] args) {
		Lambda test = new Lambda();
		MathOperator addition = (int a, int b) -> a + b;
		MathOperator substract = (a, b) -> (a - b);
		MathOperator multiplication = (int a, int b) -> {
			return a * b;
		};
		MathOperator division = (int a, int b) -> {
			return a / b;
		};

		System.out.println("10+5=" + test.operate(10, 5, addition));
		System.out.println("10-5=" + test.operate(10, 5, substract));
		System.out.println("10+5=" + test.operate(10, 5, multiplication));
		System.out.println("10+5=" + test.operate(10, 5, division));

	}

	interface MathOperator {
		int operation(int a, int b);

	}

	private int operate(int a, int b, MathOperator MathOperator) {
		return MathOperator.operation(a, b);

	}

}
