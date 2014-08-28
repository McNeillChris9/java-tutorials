package com.mnws.java.tutorials.codingbat.warmup1.sumdouble;

public class SumDoubleSolution implements SumDouble {

	@Override
	public int sumDouble(int a, int b) {
		// Store the sum in a local variable
		int sum = a + b;

		// Double it if a and b are the same
		if (a == b) {
			sum = sum * 2;
		}

		return sum;
	}

}
