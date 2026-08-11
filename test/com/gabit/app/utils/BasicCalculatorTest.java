package com.gabit.app.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class BasicCalculatorTest {

	BasicCalculator myCalculator = new BasicCalculator();
	
	@Nested
	class additionTests {
		
		@Test
		void shouldAddTwoPositiveNumbers() {
			assertEquals(3, myCalculator.addition(1, 2));
		}
		
		@Test
		void shouldAddTwoNegativeNumbers() {
			assertEquals(-5, myCalculator.addition(-1, -4));
		}
		
		@Test
		void shouldAddPositiveAndNegativeNumbers() {
			assertEquals(3, myCalculator.addition(-2, 5));
		}
		
		@Test
		void shouldAddZero() {
			assertEquals(8, myCalculator.addition(8, 0));
		}
	}
	
	@Nested
	class substractTests {
		
		@Test
		void shouldSubstractTwoPositiveNumbers() {
			assertEquals(4, myCalculator.substraction(6, 2));
		}
		
		@Test
		void shouldSubstractTwoNegativeNumbers() {
			assertEquals(3, myCalculator.substraction(-1, -4));
		}
		
		@Test
		void shouldSubstractPositiveAndNegativeNumbers() {
			assertEquals(-7, myCalculator.substraction(-2, 5));
		}
		
		@Test
		void shouldSubstractZero() {
			assertEquals(8, myCalculator.substraction(8, 0));
		}
	}
	
	@Nested
	class multiplyTests {
		
		@Test
		void shouldMultiplyTwoPositiveNumbers() {
			assertEquals(8, myCalculator.multiplication(2, 4));
		}
	}
	
}
	
