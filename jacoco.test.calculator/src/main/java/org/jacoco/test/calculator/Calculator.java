package org.jacoco.test.calculator;

public class Calculator {
	
	public static int add(int a, int b){
		return a + b;
	}
	
	public static int substract(int a, int b) {
		return a - b;
	}
	
	public static int divide (int a, int b) {
		int result = 0;
		if (b > 0) {
			result = a / b;  
		}
		return result;
	}

}
