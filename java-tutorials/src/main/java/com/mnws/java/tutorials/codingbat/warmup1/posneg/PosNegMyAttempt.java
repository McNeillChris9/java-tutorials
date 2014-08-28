package com.mnws.java.tutorials.codingbat.warmup1.posneg;

public class PosNegMyAttempt implements PosNeg {

	@Override
	public boolean posNeg(int a, int b, boolean negative) {		
		/**
		 * Short version
		 * return (negative)? (a < 0 && b < 0) : (a >= 0 && b < 0) || (b >= 0 && a < 0);	
		 */
		
		if(negative){
			return (a < 0 && b < 0); 	
		}else{
			return (a >= 0 && b < 0) || (b >= 0 && a < 0);	
		}				
	}

}
