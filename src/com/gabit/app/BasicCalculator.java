package com.gabit.app;

public class BasicCalculator {
	
	public int addition(int adding1, int adding2) {
		long result = (long)adding1 + adding2;
		checkOverflow(result);
		return (int)adding1 + adding2;
	}
	
	public int subtraction(int minuend, int subtracting) {
		long result = (long)minuend - subtracting;
		checkOverflow(result);
		return (int)minuend - subtracting;
	}
	
	public int multiply(int multiplicand, int multiplicator) {
		long result = (long)multiplicand * multiplicator;
		checkOverflow(result);
		return (int)multiplicand * multiplicator;
	}
	
	public int divide(int dividend, int divisor) {
		long result = (long)dividend / divisor;
		checkOverflow(result);
		return dividend / divisor;
	}
	
	private void checkOverflow(long result) {
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			throw new OverflowException("Overflow: Result " + result + " exceed int range.");
		}
	}
}
