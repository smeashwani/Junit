package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


public class UsingParameterizedTest {

	@ParameterizedTest(name = "Parameter")
	@MethodSource("getStudents")
	public void testParametrizationWithObjectInput(Student student) {
		System.out.println("Student name:" + student.getName());
		assertTrue(student.getAge() < 14);
	}

	public static Stream<Student> getStudents() {
		return Stream.of(new Student("St 1", 11), new Student("St 2", 12), new Student("St 3", 13));
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2 })
	public void testParameterizationForPrimitiveInput(int input) {
		assertEquals(input * input, MathUtil.multiple(input, input));
	}
}