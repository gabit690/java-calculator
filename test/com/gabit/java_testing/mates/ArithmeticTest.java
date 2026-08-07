package com.gabit.java_testing.mates;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ArithmeticTest {
	
    @Test
    void constructorShouldThrowException() throws Exception {
        Constructor<Arithmetic> constructor = Arithmetic.class.getDeclaredConstructor();
        constructor.setAccessible(true); // "salteamos" el private

        InvocationTargetException exception = assertThrows(
            InvocationTargetException.class,
            constructor::newInstance
        );

        // La excepción real queda envuelta dentro de InvocationTargetException
        assertTrue(exception.getCause() instanceof UnsupportedOperationException);
        assertEquals("Utility class", exception.getCause().getMessage());
    }

	@Test
	void twoPlusTwoShoulBeFour() {
		assertEquals(4, Arithmetic.adition(2, 2));
	}

	@Test
	void threeTimesTwoShouldBeSix() {
		assertTrue(Arithmetic.multiplication(3, 2) == 6);
	}
}
