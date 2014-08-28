package com.mnws.java.tutorials.codingbat.warmup1.posneg;

public class PosNegSolution implements PosNeg {

	@Override
	public boolean posNeg(int a, int b, boolean negative) {		
		if (negative) {
		    return (a < 0 && b < 0);
		  }
		  else {
		    return ((a < 0 && b > 0) || (a > 0 && b < 0));
		  }				
	}

}
