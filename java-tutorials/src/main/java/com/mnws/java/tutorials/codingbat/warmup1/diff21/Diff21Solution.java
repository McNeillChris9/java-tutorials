package com.mnws.java.tutorials.codingbat.warmup1.diff21;

public class Diff21Solution implements Diff21 {

	@Override
	public int diff21(int n) {
		if (n <= 21) {
			return 21 - n;
		} else {
			return (n - 21) * 2;
		}
	}

}
