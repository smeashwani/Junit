package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionTest {

	@Test
	void shouldThrowException() {
	   Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
	     throw new UnsupportedOperationException("Not supported");
	   });
	   assertEquals("Not supported", exception.getMessage());
	}

	@Test
	void assertThrowsException() {
	   String str = null;
	   assertThrows(IllegalArgumentException.class, () -> {
	     Integer.valueOf(str);
	   });
	}

}
