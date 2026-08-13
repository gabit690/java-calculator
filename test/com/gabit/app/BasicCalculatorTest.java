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
	class substractionTests {
		
		@Test
		void subtract_twoPositiveNumbers_returnsDifference() {
			assertEquals(4, myCalculator.subtraction(6, 2));
		}
		
		@Test
		void subtract_resultingInNegative_returnsNegative() {
			assertTrue(myCalculator.subtraction(3, 5) < 0);
		}
		
		@Test
		void subtract_numberFromItself_returnsZero() {
			assertEquals(0, myCalculator.subtraction(4, 4));
		}
		
		@Test
		void subtract_zeroFromNumber_returnsSameNumber() {
			assertEquals(5, myCalculator.subtraction(5, 0));
		}
		
		@Test
		void subtract_minValueMinus1_throwsOverflowException() {
			assertThrows(OverflowException.class, () -> myCalculator.subtraction(Integer.MIN_VALUE, 1));
		}
		
		@Test
		void subtract_minusOneFromMaxValue() {
			assertThrows(OverflowException.class, () -> myCalculator.subtraction(Integer.MAX_VALUE, -1));	
		}
		
	}
	
	@Nested
	class multiplicationTests {
		
		@Test
		void multiply_twoPositiveNumbers_returnsProduct() {
			assertEquals(8, myCalculator.multiplication(2, 4));
		}
		
		@Test
		void multiply_positiveAndNegativeNumbers_returnsNegativeProduct() {
			assertTrue(myCalculator.multiplication(2, -4) < 0);
		}
		
		@Test
		void multiply_twoNegativeNumbers_returnsPositiveProduct() {
			assertTrue(myCalculator.multiplication(-2, -4) > 0);
		}
		
		@Test
		void multiply_numberByZero_returnsZero() {
			assertEquals(0, myCalculator.multiplication(10, 0));
		}
		
		@Test
		void multiply_numberByOne_returnsSameNumber() {
			assertEquals(3, myCalculator.multiplication(3, 1));
		}
		
		@Test
		void multiply_maxValueByNegativeTwo_overflows() {
			assertThrows(OverflowException.class, () -> myCalculator.multiplication(Integer.MAX_VALUE, -2));
		}
		
		@Test
		void multiply_minValueByNegativeTwo_overflows() {
			assertThrows(OverflowException.class, () -> myCalculator.multiplication(Integer.MIN_VALUE, -2));
		}
		
		@Test
		void multiply_minValueByNegativeOne_overflows() {
			assertThrows(OverflowException.class, () -> myCalculator.multiplication(Integer.MIN_VALUE, -1));
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
	
