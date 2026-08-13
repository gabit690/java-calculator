package com.gabit.app;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.gabit.app.BasicCalculator;

class BasicCalculatorTest {

	BasicCalculator myCalculator = new BasicCalculator();
	
	@Nested
	class additionTests {
		
		@Test
		void add_twoPostiveNumbers_returnsSum() {
			assertEquals(3, myCalculator.addition(1, 2));
		}
		
		@Test
		void add_twoNegativeNumbers_returnsSum() {
			assertEquals(-5, myCalculator.addition(-1, -4));
		}
		
		@Test
		void add_positiveAndNegativeNumbers_returnsSum() {
			assertEquals(3, myCalculator.addition(-2, 5));
		}
		
		@Test
		void add_zeroToNumber_returnsSameNumber() {
			assertEquals(8, myCalculator.addition(8, 0));
		}
		
		@Test
		void add_maxValuePlusOne_throwsOverflowException() {
			assertThrows(OverflowException.class, () -> myCalculator.addition(Integer.MAX_VALUE, 1));	
		}
		
		@Test
		void add_minValuePlusMinusOne_throwsOverflowException() {
			assertThrows(OverflowException.class, () -> myCalculator.addition(Integer.MIN_VALUE, -1));	
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
		
		@Test
		void shouldMultiplyTwoNegativeNumbersReturnPositive() {
			assertTrue(myCalculator.multiplication(-2, -4) > 0);
		}
	}
	
	@Nested
	class divide {
		
		@Test
		void shouldDivideTwoNumbers() {
			assertEquals(3, myCalculator.division(6, 2));
		}
	}
	
}
	
