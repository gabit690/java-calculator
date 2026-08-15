package com.gabit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

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
		void add_maxValuePlusOne_overflows() {
			assertThrows(OverflowException.class, () -> myCalculator.addition(Integer.MAX_VALUE, 1));	
		}
		
		@Test
		void add_minValuePlusMinusOne_overflows() {
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
		void subtract_minValueMinusOne_overflows() {
			assertThrows(OverflowException.class, () -> myCalculator.subtraction(Integer.MIN_VALUE, 1));
		}
		
		@Test
		void subtract_minusOneFromMaxValue_overflows() {
			assertThrows(OverflowException.class, () -> myCalculator.subtraction(Integer.MAX_VALUE, -1));	
		}
		
	}
	
	@Nested
	class multiplicationTests {
		
		@Test
		void multiply_twoPositiveNumbers_returnsProduct() {
			assertEquals(8, myCalculator.multiply(2, 4));
		}
		
		@Test
		void multiply_positiveAndNegativeNumbers_returnsNegativeProduct() {
			assertTrue(myCalculator.multiply(2, -4) < 0);
		}
		
		@Test
		void multiply_twoNegativeNumbers_returnsPositiveProduct() {
			assertTrue(myCalculator.multiply(-2, -4) > 0);
		}
		
		@Test
		void multiply_numberByZero_returnsZero() {
			assertEquals(0, myCalculator.multiply(10, 0));
		}
		
		@Test
		void multiply_numberByOne_returnsSameNumber() {
			assertEquals(3, myCalculator.multiply(3, 1));
		}
		
		@Test
		void multiply_maxValueByNegativeTwo_overflows() {
			assertThrows(OverflowException.class, () -> myCalculator.multiply(Integer.MAX_VALUE, -2));
		}
		
		@Test
		void multiply_minValueByNegativeTwo_overflows() {
			assertThrows(OverflowException.class, () -> myCalculator.multiply(Integer.MIN_VALUE, -2));
		}
		
		@Test
		void multiply_minValueByNegativeOne_overflows() {
			assertThrows(OverflowException.class, () -> myCalculator.multiply(Integer.MIN_VALUE, -1));
		}
	}
	
	@Nested
	class divisionTests {
		
		@Test
		void divide_twoPositiveNumbers_returnsPositiveQuotient() {
			assertTrue(myCalculator.divide(6, 2) > 0);
		}
		
		@Test
		void divide_positiveByNegative_returnsNegativeQuotient() {
			assertTrue(myCalculator.divide(10, -2) < 0);
		}
		
		@Test
		void divide_twoNegativeNumbers_returnsPositiveQuotient() {
			assertTrue(myCalculator.divide(-4, -1) > 0);
		}
		
		@Test
		void divide_zeroByNumber_returnsZero() {
			assertEquals(0, myCalculator.divide(0, 4));
		}
		
		@Test
		void divide_nonExactValues_truncatesResult() {
			assertEquals(2, myCalculator.divide(5, 2));
		}
		
		@Test
		void divide_byZero_throwsArithmeticException() {
			assertThrows(ArithmeticException.class, () -> myCalculator.divide(10, 0));
		}
		
		@Test
		void divide_minValueByNegativeOne_overlflows() {
			assertThrows(OverflowException.class, () -> myCalculator.divide(Integer.MIN_VALUE, -1));
		}
	}
	
}
	
