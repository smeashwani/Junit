package com.training;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Test;

public class AssertTest {

	@Test
	void Test() {
		char[] expected = { 'J', 'u', 'p', 'i', 't', 'e', 'r' };
		char[] actual = "Jupiter".toCharArray();
		assertArrayEquals(expected, actual, "Arrays should be equal");

		float square = 2 * 2;
		float rectangle = 2 * 2;
		assertEquals(square, rectangle);

		Integer value = 5; // result of an algorithm
		assertNotEquals(0, value, "The result cannot be 0");

		assertTrue(5 > 4, "5 is greater the 4");
		assertTrue(null == null, "null is equal to null");

		BooleanSupplier condition = () -> 5 > 6;
		assertFalse(condition, "5 is not greater then 6");

		Object dog = new Object();
		assertNotNull(dog, () -> "The dog should not be null");

		Object cat = null;
		assertNull(cat, () -> "The cat should be null");

		Object obj = null;
		   assertAll(
		     "heading",
		     () -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
		     () -> assertEquals("java", "JAVA".toLowerCase()),
		     () -> assertNull(obj, "obj is null")
		   );

	}
}
