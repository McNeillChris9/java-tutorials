package com.mnws.java.tutorials.codingbat.warmup1.nearhundred;

public class NearHundredMyAttempt implements NearHundred {

	@Override
	public boolean nearHundred(int n) {
		return (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10 );
	}

}
