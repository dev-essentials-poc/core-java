package com.lambda.expression;

import com.functional.interfac.FunctionalInterface1;

class LambdaExpression {
	public static void main(String args[]) {
		FunctionalInterface1 obj = (i, j) -> i + j;
		System.out.println(obj.printSum(100, 200));
	}
}