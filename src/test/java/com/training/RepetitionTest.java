package com.training;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public class RepetitionTest {

	@RepeatedTest(value = 3, name = "{displayName} -> {currentRepetition}")
	public void verifyRandomNumberRange() {
		int random = MathUtil.getRandom() ;
		System.out.println("Random : "+ random);
		assertTrue(random < 100);
	}
}
