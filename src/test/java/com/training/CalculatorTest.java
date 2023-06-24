package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testMultiply() {
		Calculator calculator = new Calculator();
		assertEquals(6, calculator.multiply(2, 3));
	}
	
	@Test
	void testMultiplyNotValid() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.multiply(2, 3));
	}

}
