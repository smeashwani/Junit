package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator = new Calculator();
	
	@BeforeAll
	static void setup() {
	System.out.println("CalculatorTest.setup()");	
	}


	@BeforeEach
	void init() {
		calculator = new Calculator();
		System.out.println("CalculatorTest.init()");
	}
	
	@AfterAll
	static void done() {
		System.out.println("CalculatorTest.done()");
	}

	@AfterEach
	void tearDown() {
		calculator = null;
		System.out.println("CalculatorTest.tearDown()");
	}

	@Test
	void testMultiply() {
		calculator = new Calculator();
		assertEquals(6, calculator.multiply(2, 3));
	}
	
	@Test
	void testMultiplyNotValid() {
		calculator = new Calculator();
		assertEquals(0, calculator.multiply(2, 3));
	}
}
