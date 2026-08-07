package com.gabit.java_testing.mates;

public class Arithmetic {
	
    private Arithmetic() {
        // Evita instanciación: es una clase de utilidades
        throw new UnsupportedOperationException("Utility class");
    }
	
	public static int adition(int operand1, int operand2) {
		return operand1 + operand2;
	}
	
	public static int multiplication(int operand1, int operand2) {
		return operand1 * operand2;
	}
}
