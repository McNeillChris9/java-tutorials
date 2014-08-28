package com.mnws.java.tutorials.codingbat.warmup1.nearhundred;

public class NearHundredSolution implements NearHundred {

	@Override
	public boolean nearHundred(int n) {		
		return ((Math.abs(100 - n) <= 10) ||
			    (Math.abs(200 - n) <= 10));
	}

}
