package com.gabit.app;

public class OverflowException extends ArithmeticException {
	private static final long serialVersionUID = 1L;

	public OverflowException(String message) {
		super(message);
	}
}
