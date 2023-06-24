package com.training;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class AppTest {

	@Test
	void testOnDev() {
		System.setProperty("ENV", "DEV");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
	}

	@Test
	void testOnProd() {
		System.setProperty("ENV", "PROD");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
	}
}