package com.gabit.app;

public class BasicCalculator {
	
	public int addition(int adding1, int adding2) {
		long result = (long)adding1 + adding2;
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			throw new OverflowException("The result of (" + adding1 + ") + (" + adding2 + ") overflows");
		}
		return (int)adding1 + adding2;
	}
	
	public int substraction(int minuend, int subtracting) {
		return minuend - subtracting;
	}
	
	public int multiplication(int multiplicand, int multiplicator) {
		return multiplicand * multiplicator;
	}
	
	public int division(int dividend, int divisor) {
		return dividend / divisor;
	}
}
