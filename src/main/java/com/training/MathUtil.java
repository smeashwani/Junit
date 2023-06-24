package com.training;

import java.util.Random;

public class MathUtil {

	public static Integer add(int i, int j) {
		return i+j;
	}

	public static Integer multiple(int i, int j) {
		return i*j;
	}

	public static Integer devide(int i, int j) {
		return i/j;
	}

	public static boolean isEven(int i) {
		return i%2==0;
	}
	
	public static int getRandom() {
		return new Random().nextInt(100);
	}

}
